package redbook.ch04_errors_without_exceptions

import redbook.ch04_errors_without_exceptions._03_map2._

/*
  Exercise 4.7 description:

  Implement sequence and traverse for Either. These should return the first error
  that’s encountered, if there is one.
 */

object _07_01_sequence {

  import _07_02_traverse._

  def sequence[E, A](es: List[Either[E, A]]): Either[E, List[A]] = traverse(es)(x ⇒ x)

}

object _07_02_traverse {

  def traverse[E, A, B](es: List[A])(f: A => Either[E, B]): Either[E, List[B]] = es match {
    case Nil    ⇒ Right(Nil)
    case h :: t ⇒ f(h).map2(traverse(t)(f))(_ :: _)
  }
}
