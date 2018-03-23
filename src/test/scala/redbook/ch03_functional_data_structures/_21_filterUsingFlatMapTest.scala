package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _21_filterUsingFlatMapTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._21_filterUsingFlatMap._

  test("filter using flatMap") {
    filter(MyList(1, 2, 3, 4, 5, 6))(_ % 2 == 0) shouldEqual MyList(2, 4, 6)
  }
}
