package redbook.ch02_gettingstarted

/*
  Exercise description:
  Implement the higher-order function that composes two functions.

 */

object _05_compose {
  def compose1[A, B, C](f: A ⇒ B, g: B ⇒ C): A ⇒ C = a ⇒ g(f(a))
  def compose2[A, B, C](f: A ⇒ B, g: B ⇒ C): A ⇒ C = f andThen g
}
