package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _23_zipWithTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._23_zipWith._

  test("zipWith") {
    zipWith(MyList(1, 2, 3, 4), MyList(1, 2, 3, 4))(_ + _) shouldEqual MyList(2, 4, 6, 8)
  }

}
