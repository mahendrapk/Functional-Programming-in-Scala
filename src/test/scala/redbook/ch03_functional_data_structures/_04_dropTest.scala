package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _04_dropTest extends FunSuite with Matchers {
  import redbook.ch03_functional_data_structures._04_drop._

  test("simple drop") {
    drop(MyList(1, 2, 3, 4), 1) shouldEqual MyList(2, 3, 4)
    drop(MyList(1, 2, 3, 4), 3) shouldEqual MyList(4)
    drop(MyList(1, 2, 3, 4), 4) shouldEqual Nil
  }

  test("drop with zero") {
    drop(MyList(1, 2, 3, 4), 0) shouldEqual MyList(1, 2, 3, 4)
    drop(MyList(Nil), 0) shouldEqual MyList(Nil)
    drop(MyList(Nil), 1) shouldEqual Nil
  }

  test("drop equalTo or excess than length") {
    drop(MyList(1, 2, 3, 4), 4) shouldEqual Nil
    drop(MyList(1, 2, 3, 4), 5) shouldEqual Nil
    drop(MyList(Nil), 1) shouldEqual Nil
  }
}
