package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _20_flatMapTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._20_flatMap._

  test("testFlatMap2") {
    flatMap(MyList(1, 2, 3))(x ⇒ MyList(x - 1, x, x + 1)) shouldEqual MyList(0, 1, 2, 1, 2, 3, 2, 3, 4)
    flatMap2(MyList(1, 2, 3))(x ⇒ MyList(x - 1, x, x + 1)) shouldEqual MyList(0, 1, 2, 1, 2, 3, 2, 3, 4)
  }

}
