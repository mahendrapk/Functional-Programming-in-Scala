package redbook.ch03_functional_data_structures

/*
  Exercise 3.17 description:
  Write a function that transforms a list of integers by adding 1 to each element.
  (Reminder: this should be a pure function that returns a new List!)
 */

object _16_addOne {

  import redbook.ch03_functional_data_structures.MyList._

  def addOne(l: MyList[Int]): MyList[Int] =
    foldRight(l, Nil: MyList[Int])((i: Int, ls: MyList[Int]) ⇒ Cons(i + 1, ls))
}
