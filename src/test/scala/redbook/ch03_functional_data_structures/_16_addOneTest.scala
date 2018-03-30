package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _16_addOneTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._16_addOne._

  test("add one") {
    addOne(List(1, 2, 3, 4)) shouldEqual List(2, 3, 4, 5)
  }

}
