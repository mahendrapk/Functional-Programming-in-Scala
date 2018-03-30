package redbook.ch03_functional_data_structures

/*
  Exercise 3.19 description:

  Write a function filter that removes elements from a list unless they satisfy a given predicate.
  Use it to remove all odd numbers from a List[Int].
 */

object _19_filter {

  import redbook.ch03_functional_data_structures.List._

  def filter[A](as: List[A])(f: A => Boolean): List[A] = {
    var buffer = new collection.mutable.ListBuffer[A]

    def go(as: List[A]): Unit = as match {
      case Nil        ⇒ ()
      case Cons(h, t) ⇒ if (f(h)) buffer += h; go(t)
    }

    go(as)
    List(buffer.toList: _*)
  }

  def filter1[A](as: List[A])(f: A ⇒ Boolean): List[A] =
    foldRight(as, Nil: List[A])((h, t) ⇒ if (f(h)) Cons(h, t) else t)
}
