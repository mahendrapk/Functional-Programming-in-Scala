package redbook.ch04_errors_without_exceptions

import org.scalatest.Matchers

class _08_errorAccumulcatorTest extends org.scalatest.FunSuite with Matchers {

  case class Person(name: Name, age: Age)
  sealed case class Name(value: String)
  sealed case class Age(value: Int)

  def mkName(name: String): Either[String, Name] =
    if (name == "" || name == null) Left("Name is empty")
    else Right(Name(name))

  def mkAge(age: Int): Either[String, Age] =
    if (age <= 0) Left("Age out of range")
    else Right(Age(age))

  test("map2 only returns one error") {
    def mkPerson(name: String, age: Int): Either[String, Person] = mkName(name).map2(mkAge(age))((x, y) ⇒ Person(x, y))
    mkPerson("", 0) shouldEqual Left("Name is empty")
  }

  test("map3 only returns all errors") {
    def mkPerson(name: String, age: Int): Either[List[String], Person] =
      mkName(name).map2AsErrorAccumulator(mkAge(age))((x, y) ⇒ Person(x, y))
    mkPerson("", 0) shouldEqual Left(List("Name is empty", "Age out of range"))
  }
}
