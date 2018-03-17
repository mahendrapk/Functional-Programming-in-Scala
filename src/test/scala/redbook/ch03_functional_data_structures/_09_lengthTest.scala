package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _09_lengthTest extends FunSuite with Matchers {

  test("length") {
    _09_length.length(Nil) shouldEqual 0
    _09_length.length(MyList(1, 2, 3, 4, 5)) shouldEqual 5
  }

}
