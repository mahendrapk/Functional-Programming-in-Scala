package redbook.ch03_functional_data_structures

/*
  Exercise 3.17 description:

  Write a function that turns each value in a List[Double] into a String. You can use
  the expression d.toString to convert some d: Double to a String.
 */

object _17_DoubletoString {
  import redbook.ch03_functional_data_structures.List._

  def doubleToString(l: List[Double]): List[String] =
    foldRight(l, Nil: List[String])((d, ls) ⇒ Cons(d.toString, ls))
}
