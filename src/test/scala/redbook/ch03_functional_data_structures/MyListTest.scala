package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class MyListTest extends FunSuite with Matchers {

  test("test list with integers") {
    MyList.sum(MyList(1, 2, 3, 4)) shouldEqual (10)
  }

  test("test list with doubles") {
    MyList.product(MyList(1, 2, 3, 4)) shouldEqual (24.0)
  }

  test("sum with foldRight") {
    MyList.sum2(MyList(1, 2, 3, 4)) shouldEqual (10)
  }

  test("product with foldRight") {
    MyList.product2(MyList(1, 2, 3, 4)) shouldEqual (24.0)
  }
}
