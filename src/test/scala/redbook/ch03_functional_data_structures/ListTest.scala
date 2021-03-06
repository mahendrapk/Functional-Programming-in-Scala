package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class ListTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures.List._

  test("test list with integers") {
    sum(List(1, 2, 3, 4)) shouldEqual (10)
  }

  test("test list with doubles") {
    product(List(1, 2, 3, 4)) shouldEqual (24.0)
  }

  test("sum with foldRight") {
    sum2(List(1, 2, 3, 4)) shouldEqual (10)
  }

  test("product with foldRight") {
    product2(List(1, 2, 3, 4)) shouldEqual (24.0)
  }
}
