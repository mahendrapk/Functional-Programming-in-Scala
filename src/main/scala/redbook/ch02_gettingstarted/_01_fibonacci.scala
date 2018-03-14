package redbook.ch02_gettingstarted

import scala.annotation.tailrec

/*
  Exercise 2.1 description:

  Write a recursive function to get the nth Fibonacci number (http://mng.bz/C29s).
  The first two Fibonacci numbers are 0 and 1. The nth number is always the sum of the
  previous two—the sequence begins 0, 1, 1, 2, 3, 5. Your definition should use a
  local tail-recursive function.
 */

object _01_fibonacci {

  def fib(n: Int): Int = {
    @tailrec
    def loop(n: Int, prev: Int, cur: Int): Int = {
      if (n == 0) prev
      else loop(n - 1, cur, cur + prev)
    }

    loop(n, 0, 1)
  }
}
