package redbook.ch02_gettingstarted

import org.scalatest.{FunSuite, Matchers}

class _02_sortedTest extends FunSuite with Matchers {

  import redbook.ch02_gettingstarted._02_sorted._

  test("test") {
    isSorted(Array(1, 2, 3, 4, 5), (a1: Int, a2: Int) => a1 < a2) shouldBe true
    isSorted(Array("aa", "ab", "ac", "az"), (a1: String, a2: String) => a1 < a2) shouldBe true
    isSorted(Array("aa", "ab", "ac", "az", "am"),
      (a1: String, a2: String) => a1 < a2) shouldBe false
  }
}
