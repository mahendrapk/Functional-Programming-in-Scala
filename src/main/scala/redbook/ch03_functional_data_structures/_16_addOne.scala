package redbook.ch03_functional_data_structures

/*
  Exercise 3.17 description:
  Write a function that transforms a list of integers by adding 1 to each element.
  (Reminder: this should be a pure function that returns a new List!)
 */

object _16_addOne {

  import redbook.ch03_functional_data_structures.List._

  def addOne(l: List[Int]): List[Int] =
    foldRight(l, Nil: List[Int])((i: Int, ls: List[Int]) ⇒ Cons(i + 1, ls))
}
