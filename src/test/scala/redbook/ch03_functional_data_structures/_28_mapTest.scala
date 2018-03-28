package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _28_mapTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._28_map._

  test("testMap") {

    map(Branch(Branch(Leaf(1), Leaf(2)), Leaf(3)))(_.toString) shouldEqual Branch(Branch(Leaf("1"), Leaf("2")),
                                                                                  Leaf("3"))

    map(Leaf(100))(_.toString) shouldEqual Leaf("100")
  }
}
