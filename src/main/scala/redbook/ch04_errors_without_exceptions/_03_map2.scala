package redbook.ch04_errors_without_exceptions

/*
  Exercise 4.3 description:

  Write a generic function map2 that combines two Option values using a binary function.
  If either Option value is None, then the return value is too. Here is its signature:
  def map2[A,B,C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C]

 */

object _03_map2 {

  def map2[A, B, C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C] = (a, b) match {
    case (None, _)          ⇒ None
    case (_, None)          ⇒ None
    case (Some(x), Some(y)) ⇒ Some(f(x, y))
  }

  def map3[A, B, C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C] = a.flatMap(x ⇒ b.flatMap(y ⇒ Some(f(x, y))))
}
