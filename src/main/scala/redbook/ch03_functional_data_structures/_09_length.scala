package redbook.ch03_functional_data_structures

/*
  Exercise 3.9 description:
  Compute the length of a list using foldRight.
 */

object _09_length {

  import redbook.ch03_functional_data_structures.List._

  def length[A](l: List[A]): Int = foldRight(l, 0)((_, acc) ⇒ acc + 1)
}
