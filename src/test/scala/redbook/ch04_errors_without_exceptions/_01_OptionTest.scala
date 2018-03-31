package redbook.ch04_errors_without_exceptions

import org.scalatest.{FunSuite, Matchers}

class _01_OptionTest extends FunSuite with Matchers {

  private val intOpt    = Some(100)
  private val stringOpt = Some("abcd")
  private val noneOpt   = None

  test("testFilter1") {
    stringOpt.filter1(!_.isEmpty) shouldEqual stringOpt
    noneOpt.filter1(_ != 100) shouldEqual None
  }

  test("testFilter") {
    stringOpt.filter1(!_.isEmpty) shouldEqual stringOpt
    noneOpt.filter1(_ != 100) shouldEqual None
  }

  test("testOrElse") {
    intOpt.orElse(Some(200)) shouldEqual intOpt
    noneOpt.orElse(stringOpt) shouldEqual stringOpt
  }

  test("testOrElse1") {
    intOpt.orElse1(Some(200)) shouldEqual intOpt
    noneOpt.orElse1(stringOpt) shouldEqual stringOpt
  }

  test("testFlatMap") {
    intOpt.flatMap(x ⇒ Some(x * x)) shouldEqual intOpt.map(x ⇒ x * x)
    noneOpt.flatMap(x ⇒ Some(x)) shouldEqual None
  }

  test("testGetOrElse") {
    intOpt.getOrElse(200) shouldEqual 100
    noneOpt.getOrElse("I was none") shouldEqual "I was none"
  }

  test("testMap") {
    intOpt.map(x ⇒ x * x) shouldEqual Some(10000)
    noneOpt.map(_.toString) shouldEqual None
  }

  test("lift") {
    def toS(int: Int): String                = int.toString
    val lifted: Option[Int] ⇒ Option[String] = Option.lift(toS)
    lifted(Some(100)) shouldEqual Some("100")

    //yay!! lifted utilizes map, which protects you
    lifted(None) shouldEqual None
  }

}
