package redbook.ch04_errors_without_exceptions

import org.scalatest.Matchers

class _04_sequenceTest extends org.scalatest.FunSuite with Matchers {

  import redbook.ch04_errors_without_exceptions._04_01_sequence._
  import redbook.ch04_errors_without_exceptions._04_02_traverse._

  test("testSequence") {
    sequence(List(Some(1), Some(2), Some(3))) shouldEqual Some(List(1, 2, 3))
    sequence(List(Some(1), None, Some(3))) shouldEqual None
    sequence(List(None)) shouldEqual None
  }

  test("traverse") {
    traverse(List(1, 2, 3))(x ⇒ Some(x * 2)) shouldEqual Some(List(2, 4, 6))
    traverse(List(1, 2, 3))(x ⇒ None) shouldEqual None
  }
}
