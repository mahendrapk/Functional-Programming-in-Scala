package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _24_hasSubsequqnceTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._24_hasSubsequqnce._

  test("testHasSubsequence") {
    hasSubsequence(List(1, 2, 3, 4), List(1, 2)) shouldEqual true
    hasSubsequence(List(1, 2, 3, 4), List(3, 4)) shouldEqual true
    hasSubsequence(List(1, 2, 3, 4), List(4)) shouldEqual true
    hasSubsequence(List(1, 2, 3, 4, 5, 6), List(1, 2, 3, 10)) shouldEqual false

    hasSubsequence(List(4), List(1, 2, 3, 4)) shouldEqual false
    hasSubsequence(List(1, 2, 3, 4), List(10, 11)) shouldEqual false
    hasSubsequence(List(1, 2, 3, 4), Nil) shouldEqual true
  }
}
