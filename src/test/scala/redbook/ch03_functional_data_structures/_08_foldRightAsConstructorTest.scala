package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _08_foldRightAsConstructorTest extends FunSuite with Matchers {
  import redbook.ch03_functional_data_structures._08_foldRightAsConstructor._

  test("cloning the list") {
    cloneList(List(1, 2, 3, 4)) shouldEqual List(1, 2, 3, 4)
  }
}
