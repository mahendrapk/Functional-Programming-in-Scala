package redbook.ch02_gettingstarted

import scala.annotation.tailrec

object _01_fibonacci extends App {

  def fib(n: Int): Int = {
    @tailrec
    def loop(n: Int, prev: Int, cur: Int): Int = {
      if (n == 0) prev
      else loop(n - 1, cur, cur + prev)
    }

    loop(n, 0, 1)
  }

  println("Expected: 0, 1, 1, 2, 3, 5, 8")
  println(
    "Actual:   %d, %d, %d, %d, %d, %d, %d"
      .format(fib(0), fib(1), fib(2), fib(3), fib(4), fib(5), fib(6)))
}
