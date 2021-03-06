package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _12_reverseTest extends FunSuite with Matchers {
  import redbook.ch03_functional_data_structures._12_reverse._

  test("list reversal") {
    reverse(List(1, 2, 3, 4)) shouldEqual (List(4, 3, 2, 1))
    reverse(Nil: List[Int]) shouldEqual Nil
  }
}
