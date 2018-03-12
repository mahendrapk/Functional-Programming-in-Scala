package redbook.ch02_gettingstarted

import org.scalatest.{FunSuite, Matchers}

class _01_fibonacciTest extends FunSuite with Matchers {

  import redbook.ch02_gettingstarted._01_fibonacci._

  test("test") {
    List(fib(0), fib(1), fib(2), fib(3), fib(4), fib(5), fib(6)) shouldBe List(
        0, 1, 1, 2, 3, 5, 8)
  }
}
