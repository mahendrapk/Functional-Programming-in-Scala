package redbook.ch03_functional_data_structures

/*
  Exercise 3.15 description:
  Hard: Write a function that concatenates a list of lists into a single list. Its runtime
  should be linear in the total length of all lists. Try to use functions we have already
  defined.
 */

import redbook.ch03_functional_data_structures.List._
import redbook.ch03_functional_data_structures._14_append._

object _15_ListOfListsConcat {
  def concat[A](ls: List[List[A]]): List[A] =
    foldRight(ls, Nil: List[A])(appendUsingFoldLeft)
}
