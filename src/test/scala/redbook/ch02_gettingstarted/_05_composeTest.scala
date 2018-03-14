package redbook.ch02_gettingstarted

import org.scalatest.{FunSuite, Matchers}

class _05_composeTest extends FunSuite with Matchers {

  import redbook.ch02_gettingstarted._05_compose._

  def greet(recepient: String): String = s"Hello $recepient"
  def count(string: String): Int       = string.length

  private val composed1: String ⇒ Int = compose1(greet, count)
  private val composed2: String ⇒ Int = compose2(greet, count)

  test("composition") {

    composed1("sunshine") shouldEqual 14
    composed1("abc") shouldEqual composed2("abc")
  }
}
