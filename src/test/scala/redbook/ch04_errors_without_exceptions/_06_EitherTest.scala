package redbook.ch04_errors_without_exceptions

import org.scalatest.Matchers

class _06_EitherTest extends org.scalatest.FunSuite with Matchers {

  def stringValue: Either[String, String] = Right("abcd")
  def intValue: Either[String, Int]       = Right(100)
  def errorValue: Either[String, String]  = Left("Logical error")

  test("Map") {
    stringValue.map(_.toUpperCase) shouldEqual Right("ABCD")
    intValue.map(_ + 100) shouldEqual Right(200)
    errorValue.map(x ⇒ x.toInt) shouldEqual errorValue
  }

  test("OrElse") {
    stringValue.orElse(intValue) shouldEqual stringValue
    errorValue.orElse(intValue) shouldEqual intValue
  }

  test("FlatMap") {
    stringValue.flatMap(x ⇒ Right(x.toUpperCase)) shouldEqual Right("ABCD")
    errorValue.flatMap(x ⇒ Right(x.toUpperCase)) shouldEqual errorValue
  }

  test("Map2") {
    intValue.map2(Right(200))(_ + _) shouldEqual Right(300)
    errorValue.map2(Right(200))(_ + _) shouldEqual errorValue
  }

}
