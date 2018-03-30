package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _18_mapTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._18_map._

  test("map to string") {
    map1(List(1.0, 2.0, 3.0))(_.toString) shouldEqual (List("1.0", "2.0", "3.0"))
    map2(List(1.0, 2.0, 3.0))(_.toString) shouldEqual (List("1.0", "2.0", "3.0"))
    map(List(1.0, 2.0, 3.0))(_.toString) shouldEqual (List("1.0", "2.0", "3.0"))
  }
}
