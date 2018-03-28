package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _27_depthTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._27_depth._

  test("maximum function") {
    depth(Branch(Branch(Leaf(1), Leaf(2)), Leaf(3))) shouldEqual 2
    depth(Leaf(100)) shouldEqual 0
    depth(Branch(Leaf(100), Branch(Leaf(100), Leaf(200)))) shouldEqual 2
  }
}
