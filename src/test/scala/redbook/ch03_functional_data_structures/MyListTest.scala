package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class MyListTest extends FunSuite with Matchers {

  test("test list with integers") {
    MyList.sum(MyList(1, 2, 3, 4)) shouldEqual (10)
  }

  test("test list with doubles") {
    MyList.product(MyList(1, 2, 3, 4)) shouldEqual (24.0)
  }

  test("test tail function") {
    MyList.tail(MyList(1, 2, 3, 4)) shouldEqual MyList(2, 3, 4)
    MyList.tail(MyList(1, 2)) shouldEqual MyList(2)
    MyList.tail(MyList(1)) shouldEqual Nil
    MyList.tail(Nil) shouldEqual Nil
    MyList.tail(MyList.tail(MyList.tail(MyList.tail(MyList(1, 2, 3, 4))))) shouldEqual Nil
  }
}
