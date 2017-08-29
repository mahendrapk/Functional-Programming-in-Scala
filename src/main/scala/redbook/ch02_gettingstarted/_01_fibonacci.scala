package redbook.ch02_gettingstarted

import org.scalatest.{FunSuite, Matchers}

import scala.annotation.tailrec

class _01_fibonacci extends FunSuite with Matchers {

  def fib(n: Int): Int = {
    @tailrec
    def loop(n: Int, prev: Int, cur: Int): Int = {
      if (n == 0) prev
      else loop(n - 1, cur, cur + prev)
    }

    loop(n, 0, 1)
  }

  test("test") {
    List(fib(0), fib(1), fib(2), fib(3), fib(4), fib(5), fib(6)) shouldBe List(
        0, 1, 1, 2, 3, 5, 8)
  }
}
