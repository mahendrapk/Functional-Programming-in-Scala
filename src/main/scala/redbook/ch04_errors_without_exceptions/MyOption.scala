package redbook.ch04_errors_without_exceptions

trait MyOption[+A] {
  def map[B](f: A ⇒ B): MyOption[B]
  def flatMap[B](f: A ⇒ MyOption[B]): MyOption[B]
  def getOrElse[B >: A](default: ⇒ B): B
  def orElse[B >: A](ob: ⇒ MyOption[B]): MyOption[B]
  def filter(f: A ⇒ Boolean): MyOption[A]
}
