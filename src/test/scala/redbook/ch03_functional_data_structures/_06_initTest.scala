package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _06_initTest extends FunSuite with Matchers {
  import redbook.ch03_functional_data_structures._06_init._

  test("init") {

    init(MyList(1, 2, 3, 4)) shouldEqual MyList(1, 2, 3)
    init(MyList(1)) shouldEqual Nil
  }

}
