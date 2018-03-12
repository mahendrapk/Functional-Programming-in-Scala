package redbook.ch02_gettingstarted

import scala.annotation.tailrec

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
