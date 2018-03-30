package redbook.ch03_functional_data_structures

/*
  Exercise 3.13 description:
  Hard: Can you write foldLeft in terms of foldRight?

  How about the other way around? Implementing foldRight via foldLeft is useful because it lets us implement
  foldRight tail-recursively, which means it works even for large lists without overflowing the stack.
 */

object _13_foldVariations {

  import redbook.ch03_functional_data_structures._10_foldLeft._
  import redbook.ch03_functional_data_structures._12_reverse._
  import redbook.ch03_functional_data_structures.List._

  //slight cheating, use reverse and foldLeft
  def foldRightViaFoldLeft[A, B](l: List[A], z: B)(f: (A, B) ⇒ B): B = foldLeft(reverse(l), z)((b, a) ⇒ f(a, b))

  //slightly refactored version to understand the flow. identity and foldOf can be anonymous functions.
  def foldRightViaFoldLeft2[A, B](l: List[A], z: B)(f: (A, B) => B): B = {
    def identity              = (b: B) ⇒ b
    def foldOf(a: A, b: B): B = f(a, b)
    foldLeft(l, identity)((id: B ⇒ B, a: A) => b => id(foldOf(a, b)))(z)
  }

  def foldLeftViaFoldRight[A, B](l: List[A], z: B)(f: (B, A) ⇒ B): B =
    foldRight(l, (b: B) ⇒ b)((a, g) ⇒ b ⇒ g(f(b, a)))(z)
}
