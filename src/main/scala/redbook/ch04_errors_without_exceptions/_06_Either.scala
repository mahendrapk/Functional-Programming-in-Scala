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

  /*
  There are a number of variations on Option and Either. If we want to accumulate multiple errors,
  There are a number of variations on Option and Either. If we want to accumulate multiple errors,
  a simple approach is a new data type that lets us keep a list of errors in the data constructor that
  represents failures:

  trait Partial[+A,+B]
  case class Errors[+A](get: Seq[A]) extends Partial[A,Nothing]
  case class Success[+B](get: B) extends Partial[Nothing,B]

  There is a type very similar to this called Validation in the Scalaz library. You can implement map,
  map2, sequence, and so on for this type in such a way that errors are accumulated when possible
  (flatMap is unable to accumulate errors–can you see why?). This idea can even be generalized
  further–we don’t need to accumulate failing values into a list; we can accumulate values using
  any user-supplied binary function.

  It’s also possible to use Either[List[E],_] directly to accumulate errors, using different implementations
  of helper functions like map2 and sequence.

  Check reference link: https://stackoverflow.com/questions/12307965/method-parameters-validation-in-scala-with-for-comprehension-and-monads/12309023
   */
  def map2AsErrorAccumulator[EE >: E, B, C](b: Either[EE, B])(f: (A, B) ⇒ C): Either[List[EE], C] =
    (this, b) match {
      case (Right(a1), Right(b1)) ⇒ Right(f(a1, b1))
      case _                      ⇒ Left(List(this, b).collect { case Left(error) ⇒ error })
    }
}

case class Left[+E](value: E)  extends Either[E, Nothing]
case class Right[+A](value: A) extends Either[Nothing, A]
