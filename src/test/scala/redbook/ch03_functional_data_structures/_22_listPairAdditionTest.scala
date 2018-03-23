package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _22_listPairAdditionTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._22_listPairAddition._

  test("testAddListPair") {
    addListPair(MyList(1, 2, 3, 4), MyList(1, 2, 3, 4)) shouldEqual MyList(2, 4, 6, 8)
    addListPair(Nil, MyList(1, 2, 3, 4)) shouldEqual Nil
    addListPair(MyList(1, 2, 3, 4), Nil) shouldEqual Nil
  }

}
