package redbook.ch02_gettingstarted

import org.scalatest.{FunSuite, Matchers}

//Currying – decomposition of function with multiple arguments into a chain of single-argument functions.

class _03_curryTest extends FunSuite with Matchers {

  import redbook.ch02_gettingstarted._03_curry._

  test("test1") {
    curry(f)(1)(1) shouldBe f(1, 1)
    curry(f)(1)(1) shouldBe g(1)(1)
  }

  test("test2") {
    theCurry(f)(1)(1) shouldBe f(1, 1)
    theCurry(f)(1)(1) shouldBe g(1)(1)
  }

}
