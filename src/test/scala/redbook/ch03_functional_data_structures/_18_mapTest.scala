package redbook.ch03_functional_data_structures

import org.scalatest.{FunSuite, Matchers}

class _18_mapTest extends FunSuite with Matchers {

  import redbook.ch03_functional_data_structures._18_map._

  test("map to string") {
    map1(MyList(1.0, 2.0, 3.0))(_.toString) shouldEqual (MyList("1.0", "2.0", "3.0"))
    map2(MyList(1.0, 2.0, 3.0))(_.toString) shouldEqual (MyList("1.0", "2.0", "3.0"))
    map(MyList(1.0, 2.0, 3.0))(_.toString) shouldEqual (MyList("1.0", "2.0", "3.0"))
  }
}
