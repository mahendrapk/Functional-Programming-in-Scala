package redbook.ch04_errors_without_exceptions

import org.scalatest.{FunSuite, Matchers}
import redbook.ch04_errors_without_exceptions._03_map2.map2

class _01_OptionWithExistingAPITest extends FunSuite with Matchers {

  //an exercise to demo Option's usage without breaking existing API
  def calc(age: Int, numberOfSpeedingTickets: Int): Double = if (age == 0) 0 else numberOfSpeedingTickets * 100 / age

  //existing function
  def unsafeBusinessLogic(age: String, tickets: String): Double = calc(age.toInt, tickets.toInt)
  //New function with matching API
  def safeBusinessLogic(age: String, tickets: String): Double = {
    def Try[A](block: ⇒ A): Option[A] = {
      try Some(block)
      catch { case e: Exception => None }
    }

    val optAge: Option[Int]     = Try { age.toInt }
    val optTickets: Option[Int] = Try { tickets.toInt }

    map2(optAge, optTickets)(calc).getOrElse(0)
  }

  test("unsafe business logic") {
    intercept[NumberFormatException] {
      unsafeBusinessLogic("abcd", "10")
    }
  }

  test("safe business logic") {
    safeBusinessLogic("abcd", "10") shouldEqual 0
  }
}
