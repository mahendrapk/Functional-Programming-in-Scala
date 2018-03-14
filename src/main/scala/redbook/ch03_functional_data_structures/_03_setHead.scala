package redbook.ch03_functional_data_structures

/*
  Exercise 3.3 description:

  Using the same idea, implement the function setHead for replacing the first element
  of a List with a different value.
 */

object _03_setHead {

  def setHead[T](myList: MyList[T], newHead: T): MyList[T] = myList match {
    case Nil         ⇒ Cons(newHead, Nil)
    case Cons(x, xs) ⇒ Cons(newHead, xs)
  }
}
