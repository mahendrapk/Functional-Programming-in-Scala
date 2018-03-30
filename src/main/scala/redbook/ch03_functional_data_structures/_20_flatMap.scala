package redbook.ch03_functional_data_structures

/*
  Exercise 3.20 description:

  Write a function flatMap that works like map except that the function given will return
  a list instead of a single result, and that list should be inserted into the final resulting
  list.
 */

object _20_flatMap {
  import redbook.ch03_functional_data_structures.List._
  import redbook.ch03_functional_data_structures._15_ListOfListsConcat._
  import redbook.ch03_functional_data_structures._18_map._
  import redbook.ch03_functional_data_structures._14_append._

  def flatMap[A, B](as: List[A])(f: A => List[B]): List[B] = concat(map(as)(f))
  def flatMap2[A, B](as: List[A])(f: A => List[B]): List[B] =
    foldRight(as, Nil: List[B])((h, acc) ⇒ appendUsingFoldLeft(f(h), acc))

}
