package redbook.ch03_functional_data_structures

sealed trait List[+A]
case object Nil                             extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {
  def sum(ints: List[Int]): Int = ints match {
    case Nil         ⇒ 0
    case Cons(x, xs) ⇒ x + sum(xs)
  }

  def product(ds: List[Double]): Double = ds match {
    case Nil         ⇒ 1.0
    case Cons(x, xs) ⇒ x * product(xs)
  }

  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil else Cons(as.head, apply(as.tail: _*))

  //============================
  //generailizing the sum and product functions

  def foldRight[A, B](as: List[A], z: B)(f: (A, B) ⇒ B): B = as match {
    case Nil        ⇒ z
    case Cons(h, t) ⇒ f(h, foldRight(t, z)(f))
  }

  def sum2(ns: List[Int]): Int           = foldRight(ns, 0)((x, y) ⇒ x + y)
  def product2(ns: List[Double]): Double = foldRight(ns, 1.0)(_ * _)
}
