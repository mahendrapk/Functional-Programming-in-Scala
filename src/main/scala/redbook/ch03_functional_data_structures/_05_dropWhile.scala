package redbook.ch03_functional_data_structures

/*
  Exercise 3.5 description:
  Implement dropWhile, which removes elements from the List prefix as long as they match a predicate.
 */

object _05_dropWhile {
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
    case Cons(h, t) if f(h) ⇒ dropWhile(t, f)
    case _                  ⇒ l
  }

  /*
    Additional notes:
    Unfortunately at the call site scala can't infer the type of T passed in the predicate parameter. Currying solves it.
   */

  def dropWhile2[A](l: List[A])(f: A ⇒ Boolean): List[A] = dropWhile(l, f)
}
