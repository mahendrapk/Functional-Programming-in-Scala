package redbook.ch03_functional_data_structures

/*
  Exercise 3.3 description:

  Using the same idea, implement the function setHead for replacing the first element
  of a List with a different value.
 */

object _03_setHead {

  def setHead[A](l: List[A], h: A): List[A] = l match {
    case Nil        ⇒ Cons(h, Nil)
    case Cons(_, t) ⇒ Cons(h, t)
  }
}
