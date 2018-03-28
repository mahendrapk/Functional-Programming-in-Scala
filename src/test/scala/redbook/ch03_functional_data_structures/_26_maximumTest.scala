package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _26_maximumTest extends FunSuite with Matchers {

  test("maximum function") {
    import redbook.ch03_functional_data_structures._26_maximum._

    maximum(Branch(Branch(Leaf(1), Leaf(2)), Leaf(3))) shouldEqual Leaf(3)
    maximum(Leaf(100)) shouldEqual Leaf(100)
    maximum(Branch(Leaf(100), Branch(Leaf(100), Leaf(200)))) shouldEqual Leaf(200)
  }
}
