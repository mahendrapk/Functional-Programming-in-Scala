package redbook.ch03_functional_data_structures

/*
  Exercise 3.6 description:
  Not everything works out so nicely. Implement a function, init, that returns a List consisting of
  all but the last element of a List. So, given List(1,2,3,4), init will return List(1,2,3).
  Why can’t this function be implemented in constant time like tail?
 */

object _06_init {

  def init[A](l: MyList[A]): MyList[A] = l match {
    case Nil          ⇒ sys.error("init on empty list")
    case Cons(_, Nil) ⇒ Nil
    case Cons(h, t)   ⇒ Cons(h, init(t))
  }
}
