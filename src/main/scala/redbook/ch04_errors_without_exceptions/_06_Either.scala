package redbook.ch04_errors_without_exceptions

/*
  Exercise 4.6 description:

  Implement versions of map, flatMap, orElse, and map2 on Either that operate on the
  Right value.
 */

sealed trait Either[+E, +A] {

  def map[B](f: A ⇒ B): Either[E, B] = this match {
    case Left(e)  ⇒ Left(e)
    case Right(a) ⇒ Right(f(a))
  }

  def flatMap[EE >: E, B](f: A ⇒ Either[EE, B]): Either[EE, B] = this match {
    case Left(e)  ⇒ Left(e)
    case Right(a) ⇒ f(a)
  }

  def orElse[EE >: E, AA >: A](b: ⇒ Either[EE, AA]): Either[EE, AA] = this match {
    case Left(e)  ⇒ b
    case Right(a) ⇒ Right(a)
  }

  def map2[EE >: E, B, C](b: Either[EE, B])(f: (A, B) ⇒ C): Either[EE, C] =
    for {
      aa <- this
      bb <- b
    } yield f(aa, bb)
}

case class Left[+E](value: E)  extends Either[E, Nothing]
case class Right[+A](value: A) extends Either[Nothing, A]
