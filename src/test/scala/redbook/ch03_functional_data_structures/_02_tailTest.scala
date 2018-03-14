package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _02_tailTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._02_tail._

  test("test tail function") {
    tail(MyList(1, 2, 3, 4)) shouldEqual MyList(2, 3, 4)
    tail(MyList(1, 2)) shouldEqual MyList(2)
    tail(MyList(1)) shouldEqual Nil
    tail(Nil) shouldEqual Nil
    tail(tail(tail(tail(MyList(1, 2, 3, 4))))) shouldEqual Nil
  }
}
