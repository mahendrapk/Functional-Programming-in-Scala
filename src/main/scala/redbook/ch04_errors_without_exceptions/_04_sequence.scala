package redbook.ch04_errors_without_exceptions

import scala.annotation.tailrec

/*
  Exercise 4.4 description:

  Write a function sequence that combines a list of Options into one Option containing
  a list of all the Some values in the original list. If the original list contains None even
  once, the result of the function should be None; otherwise the result should be Some
  with a list of all the values. Here is its signature:3

  def sequence[A](a: List[Option[A]]): Option[List[A]]

 */

object _03_sequence {

  def sequence[A](a: List[Option[A]]): Option[List[A]] = a match {
    case Nil    ⇒ Some(Nil)
    case h :: t ⇒ h.flatMap(hh ⇒ sequence(t).map(hh :: _))
  }
}
