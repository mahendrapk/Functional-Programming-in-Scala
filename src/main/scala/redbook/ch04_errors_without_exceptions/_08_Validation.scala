package redbook.ch04_errors_without_exceptions

sealed trait Validation[+E, +A] {

  def isSuccess: Boolean = this match {
    case Validated(_)  ⇒ true
    case ErrorTrail(_) ⇒ false
  }

  def isFailure: Boolean = !isSuccess

}

final case class ErrorTrail[+E, +A](e: List[String]) extends Validation[E, Nothing]
final case class Validated[+E, +A](value: A)         extends Validation[A, Nothing]
