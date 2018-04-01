package redbook.ch04_errors_without_exceptions

import org.scalatest.Matchers

class _05_sequenceViaTraverseTest extends org.scalatest.FunSuite with Matchers {

  import redbook.ch04_errors_without_exceptions._05_sequenceViaTraverse._

  test("sequenceViaTraverse") {
    sequenceViaTraverse(List(Some(1), Some(2), Some(3))) shouldEqual Some(List(1, 2, 3))
    sequenceViaTraverse(List(Some(1), None, Some(3))) shouldEqual None
    sequenceViaTraverse(List(None)) shouldEqual None
  }
}
