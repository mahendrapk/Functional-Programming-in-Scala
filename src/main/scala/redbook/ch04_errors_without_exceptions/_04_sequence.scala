package redbook.ch04_errors_without_exceptions

import redbook.ch04_errors_without_exceptions._03_map2._

/*
  Exercise 4.4 description:

  Write a function sequence that combines a list of Options into one Option containing
  a list of all the Some values in the original list. If the original list contains None even
  once, the result of the function should be None; otherwise the result should be Some
  with a list of all the values. Here is its signature:3

  def sequence[A](a: List[Option[A]]): Option[List[A]]

 */

object _04_01_sequence {

  def sequence[A](a: List[Option[A]]): Option[List[A]] = a match {
    case Nil    ⇒ Some(Nil)
    case h :: t ⇒ h.flatMap(hh ⇒ sequence(t).map(hh :: _))
  }
}

/*
  Sometimes we’ll want to map over a list using a function that might fail, returning
  None if applying it to any element of the list returns None. For example, what if we have
  a whole list of String values that we wish to parse to Option[Int]? In that case, we can
  simply sequence the results of the map:

  def parseInts(a: List[String]): Option[List[Int]] = sequence(a map (i => Try(i.toInt)))

  Unfortunately, this is inefficient, since it traverses the list twice, first to convert each
  String to an Option[Int], and a second pass to combine these Option[Int] values
  into an Option[List[Int]]. Wanting to sequence the results of a map this way is a
  common enough occurrence to warrant a new generic function, traverse, with the
  following signature:

  def traverse[A, B](a: List[A])(f: A => Option[B]): Option[List[B]]
 */

object _04_02_traverse {

  def traverse[A, B](a: List[A])(f: A => Option[B]): Option[List[B]] = a match {
    case Nil    ⇒ Some(Nil)
    case h :: t ⇒ map2(f(h), traverse(t)(f))(_ :: _)
  }
}
