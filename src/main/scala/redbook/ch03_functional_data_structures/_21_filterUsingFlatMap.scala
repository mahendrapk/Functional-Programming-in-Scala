package redbook.ch03_functional_data_structures

/*
  Exercise 3.21 description:

  Use flatMap to implement filter.
 */

object _21_filterUsingFlatMap {

  import redbook.ch03_functional_data_structures._20_flatMap._

  def filter[A](as: List[A])(f: A ⇒ Boolean): List[A] = flatMap(as)(x ⇒ if (f(x)) List(x) else Nil)
}
