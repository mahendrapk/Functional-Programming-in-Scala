package redbook.ch03_functional_data_structures

import scala.annotation.tailrec

/*
  Exercise 3.12 description:
  Write a function that returns the reverse of a list (given List(1,2,3) it returns
  List(3,2,1)). See if you can write it using a fold.
 */

object _12_reverse {

  import redbook.ch03_functional_data_structures._10_foldLeft._

  def reverse[T](as: MyList[T]): MyList[T] = foldLeft(as, MyList[T]())((acc, h) ⇒ Cons(h, acc))

}
