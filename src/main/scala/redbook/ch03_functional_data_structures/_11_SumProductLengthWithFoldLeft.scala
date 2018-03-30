package redbook.ch03_functional_data_structures

/*
  Exercise 3.11 description:
  Write sum, product, and a function to compute the length of a list using foldLeft.
 */

object _11_SumProductLengthWithFoldLeft {

  import redbook.ch03_functional_data_structures._10_foldLeft._

  def sum3(as: List[Int]): Int           = foldLeft(as, 0)(_ + _)
  def product3(as: List[Double]): Double = foldLeft(as, 0.0)(_ * _)
  def length3[T](as: List[T]): Int       = foldLeft(as, 0)((acc, _) ⇒ acc + 1)
}
