package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _10_foldLeftTest extends FunSuite with Matchers {
  import redbook.ch03_functional_data_structures._10_foldLeft._

  test("fold Left") {
    foldLeft(MyList(1, 2, 3, 4, 5), 0)((a, b) ⇒ a + b) shouldEqual 15
    foldLeft(Nil: MyList[Int], 0)((a, b) ⇒ a + b) shouldEqual 0
  }
}
