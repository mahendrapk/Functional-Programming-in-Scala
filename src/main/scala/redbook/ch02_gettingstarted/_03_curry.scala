package redbook.ch02_gettingstarted

import org.scalatest.{FunSuite, Matchers}

class _03_curry extends FunSuite with Matchers {

  def curry[A, B, C](f: (A, B) => C): A => (B => C) =
    (a: A) => (b: B) => f(a, b)

  def theCurry[A, B, C](f: (A, B) => C): A => (B => C) = f.curried

  def f(a: Int, b: Int): Int = a + b
  def g(a: Int)(b: Int): Int = a + b

  test("test1") {
    curry(f)(1)(1) shouldBe f(1, 1)
    curry(f)(1)(1) shouldBe g(1)(1)
  }

  test("test2") {
    theCurry(f)(1)(1) shouldBe f(1, 1)
    theCurry(f)(1)(1) shouldBe g(1)(1)
  }

}
