package redbook.ch03_functional_data_structures

/*
  Exercise 3.29 description

  Generalize size, maximum, depth, and map, writing a new function fold that abstracts
  over their similarities. Reimplement them in terms of this more general function. Can
  you draw an analogy between this fold function and the left and right folds for List?
 */

object _29_foldAndGeneralizations {

  private def fold[A, B](t: Tree[A])(f: A ⇒ B)(g: (B, B) => B): B = t match {
    case Leaf(x)      ⇒ f(x)
    case Branch(l, r) ⇒ g(fold(l)(f)(g), fold(r)(f)(g))
  }

  def mapViaFold[A, B](t: Tree[A])(f: A ⇒ B): Tree[B] = fold(t)(a ⇒ Leaf(f(a)): Tree[B])(Branch(_, _))
  def sizeViaFold[A](t: Tree[A]): Int                 = fold(t)(a ⇒ 1)(1 + _ + _)
}
