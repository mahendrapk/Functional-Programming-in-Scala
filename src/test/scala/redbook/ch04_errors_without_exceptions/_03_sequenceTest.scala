package redbook.ch04_errors_without_exceptions

import org.scalatest.Matchers

class _03_sequenceTest extends org.scalatest.FunSuite with Matchers {

  import redbook.ch04_errors_without_exceptions._03_sequence._

  test("testSequence") {
    sequence(List(Some(1), Some(2), Some(3))) shouldEqual Some(List(1, 2, 3))
    sequence(List(Some(1), None, Some(3))) shouldEqual None
    sequence(List(None)) shouldEqual None
  }

}
