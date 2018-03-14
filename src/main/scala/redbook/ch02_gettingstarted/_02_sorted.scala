package redbook.ch02_gettingstarted

import scala.annotation.tailrec

/*
  Exercise 2.2 description:

  Implement isSorted, which checks whether an Array[A] is sorted according to a
  given comparison function:
 */

object _02_sorted {

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {

    def hasNext(i: Int): Boolean = i + 1 < as.length

    @tailrec
    def loop(n: Int): Boolean = {
      if (!hasNext(n)) true
      else if (!ordered(as(n), as(n + 1))) false
      else loop(n + 1)
    }

    loop(0)
  }
}
