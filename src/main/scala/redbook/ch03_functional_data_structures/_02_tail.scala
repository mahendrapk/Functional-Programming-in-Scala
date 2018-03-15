package redbook.ch03_functional_data_structures

/*
  Exercise 3.2 description:
  Implement the function tail for removing the first element of a List. Note that the
  function takes constant time. What are different choices you could make in your
  implementation if the List is Nil? We’ll return to this question in the next chapter.
 */

object _02_tail {

  def tail[T](l: MyList[T]): MyList[T] = l match {
    case Nil        ⇒ sys.error("tail of empty list")
    case Cons(_, t) ⇒ t
  }

}
