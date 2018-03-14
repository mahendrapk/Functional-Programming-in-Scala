package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _03_setHeadTest extends FunSuite with Matchers {
  import redbook.ch03_functional_data_structures._03_setHead._

  test("test tail function") {
    setHead(MyList(1, 2, 3, 4), 100) shouldEqual MyList(100, 2, 3, 4)
    setHead(MyList(1, 2), 100) shouldEqual MyList(100, 2)
    setHead(MyList(1), 100) shouldEqual MyList(100)
    setHead(Nil, 100) shouldEqual MyList(100)
  }
}
