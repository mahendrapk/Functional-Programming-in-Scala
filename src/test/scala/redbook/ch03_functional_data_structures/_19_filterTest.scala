package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _19_filterTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._19_filter._

  test("filter") {
    filter(MyList(1, 2, 3, 4, 5, 6))(_  % 2 == 0) shouldEqual MyList(2, 4, 6)
    filter1(MyList(1, 2, 3, 4, 5, 6))(_ % 2 == 0) shouldEqual MyList(2, 4, 6)
  }
}
