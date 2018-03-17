package redbook.ch03_functional_data_structures

/*
  Exercise 3.9 description:
  Compute the length of a list using foldRight.
 */

object _09_length {

  import redbook.ch03_functional_data_structures.MyList._

  def length[A](l: MyList[A]): Int = foldRight(l, 0)((_, acc) ⇒ acc + 1)
}
