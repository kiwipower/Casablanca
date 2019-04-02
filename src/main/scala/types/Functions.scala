package types

object Functions {

  case class MyNumber(value: Int) {
    def add(number: MyNumber): MyNumber = ???
  }

  class Place(name: String)

  def addItUpInts(ints: List[Int]): Int = ???

  def addItUpString(ints: List[String]): String = ???

  def addItUp(i: Int, i1: Int): Int = ???

  def addItUp(i: String, i1: String): String = ???

  def divideBy2(in: MyNumber): MyNumber = if (in.value % 2 != 0) null else MyNumber(in.value/2)
}
