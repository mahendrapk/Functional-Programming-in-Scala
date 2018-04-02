package redbook.ch04_errors_without_exceptions

import org.scalatest.Matchers

class _07_sequenceAndTraverseTest extends org.scalatest.FunSuite with Matchers {

  import redbook.ch04_errors_without_exceptions._07_02_traverse._
  import redbook.ch04_errors_without_exceptions._07_01_sequence._

  def makeInt(s: String): Either[String, Int] = try { Right(s.toInt) } catch { case e: Exception ⇒ Left(e.toString) }

  test("traverse reports 1st error") {
    traverse(List("1", "2", "abcd", "efgh"))(makeInt) shouldEqual Left(
      "java.lang.NumberFormatException: For input string: \"abcd\""
    )

    traverse(List("1", "2", "3", "4"))(makeInt) shouldEqual Right(List(1, 2, 3, 4))
    traverse(List.empty)(makeInt) shouldEqual Right(List.empty)
  }
  test("sequence") {
    sequence(List(Right(1), Right(2))) shouldEqual Right(List(1, 2))
    sequence(List(Right(1), Left("error value"))) shouldEqual Left("error value")
  }
}
