package redbook.ch03_functional_data_structures

/*
  Exercise 3.14 description:

  Implement append in terms of either foldLeft or foldRight.
 */

object _14_append {
  import redbook.ch03_functional_data_structures.MyList._
  import redbook.ch03_functional_data_structures._10_foldLeft._
  import redbook.ch03_functional_data_structures._12_reverse._

  def appendUsingFoldRight[A](l: MyList[A], r: MyList[A]): MyList[A] = foldRight(l, r)(Cons(_, _))
  def appendUisngFoldLeft[A](l: MyList[A], r: MyList[A]): MyList[A]  = foldLeft(reverse(l), r)((acc, a) ⇒ Cons(a, acc))

}
