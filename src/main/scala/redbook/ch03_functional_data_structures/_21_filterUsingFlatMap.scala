package redbook.ch03_functional_data_structures

/*
  Exercise 3.19 description:

  Use flatMap to implement filter.
 */

object _21_filterUsingFlatMap {

  import redbook.ch03_functional_data_structures._20_flatMap._

  def filter[A](as: MyList[A])(f: A ⇒ Boolean): MyList[A] = flatMap(as)(x ⇒ if (f(x)) MyList(x) else Nil)
}
