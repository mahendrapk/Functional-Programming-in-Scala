package redbook.ch02_gettingstarted

import org.scalatest.{FunSuite, Matchers}

import scala.annotation.tailrec

class _02_sorted extends FunSuite with Matchers {

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {

    def hasNext(i: Int): Boolean = i + 1 < as.length

    @tailrec
    def loop(n: Int): Boolean = {
      if (hasNext(n) == false) true
      else if (ordered(as(n), as(n + 1)) == false) false
      else loop(n + 1)
    }

    loop(0)
  }

  test("test") {
    isSorted(Array(1, 2, 3, 4, 5), (a1: Int, a2: Int) => a1 < a2) shouldBe true
    isSorted(Array("aa", "ab", "ac", "az"), (a1: String, a2: String) => a1 < a2) shouldBe true
    isSorted(Array("aa", "ab", "ac", "az", "am"),
             (a1: String, a2: String) => a1 < a2) shouldBe false
  }
}
