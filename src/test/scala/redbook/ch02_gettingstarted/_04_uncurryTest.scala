package redbook.ch02_gettingstarted

import org.scalatest.{FunSuite, Matchers}

//UnCurrying – a chain of single-argument functions, are composed into multiple argument function

class _04_uncurryTest extends FunSuite with Matchers {

  import redbook.ch02_gettingstarted._04_uncurry._

  def f(a: Int)(b: Int)(c: Int) = a + b + c

  private def intToIntToInt: Int => Int => Int = f(1)

  test("test uncurry"){
    uncurry(f)(1, 2)(3) shouldEqual f(1)(2)(3)
    cheatingUncurry(f)(1, 2)(3) shouldEqual f(1)(2)(3)
  }

}
