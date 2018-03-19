package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _14_appendTest extends FunSuite with Matchers {
  import redbook.ch03_functional_data_structures._14_append._

  test("append") {
    appendUsingFoldRight(MyList(1, 2, 3, 4), MyList(5, 6, 7, 8)) shouldEqual MyList(1, 2, 3, 4, 5, 6, 7, 8)
    appendUsingFoldLeft(MyList(1, 2, 3, 4), MyList(5, 6, 7, 8)) shouldEqual MyList(1, 2, 3, 4, 5, 6, 7, 8)
  }
}
