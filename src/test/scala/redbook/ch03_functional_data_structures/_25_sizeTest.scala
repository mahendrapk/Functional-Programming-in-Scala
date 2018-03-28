package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _25_sizeTest extends FunSuite with Matchers {

  test("size function") {
    //rename the clashing function name
    import redbook.ch03_functional_data_structures._25_size.{size ⇒ treeSize}

    treeSize(Branch(Branch(Leaf(1), Leaf(2)), Leaf(3))) shouldEqual 5
    treeSize(Leaf(100)) shouldEqual 1
    treeSize(Branch(Leaf(100), Branch(Leaf(1), Leaf(2)))) shouldEqual 5
  }
}
