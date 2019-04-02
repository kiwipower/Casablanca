package types

import org.scalatest.{FunSuite, Matchers}
import types.Functions._


class SafetySpec extends FunSuite with Matchers {

  // Values can belong to different types
  test("When is a number not a number?") {
    1 shouldBe new Integer(1)
    1 shouldBe "1"
    1 shouldBe MyNumber(1)
  }

  // An operation might make sense to do different things depending of the type
  test("Make the following in Scala") {
    addItUpInts(List(1, 2, 3, 4, 5)) shouldBe 15
    addItUpString(List("hello", "What", "Will", "Happen")) shouldBe "helloWhatWillHappen"
  }

  // We can give types methods (OO)
  test("Add my number together") {
    MyNumber(1).add(MyNumber(2)) shouldBe MyNumber(3)
  }

  // Methods can have different definitions depending on the type of the parameter (overloading)
  test("One function Different types") {
    addItUp(1, 2) shouldBe 3
    addItUp("Hello", " there") shouldBe "Hello there"


    // Implement this function below
    //addItUp(MyNumber(1), MyNumber(2)) shouldBe MyNumber(3)
  }

  // Equality
  test("Not all objects are equal even if the types and values look the same") {

    val london = new Place("London")
    val london1 = new Place("London")
    val casablanca = new Place("Casablanca")

    london shouldBe london
    london should not be casablanca

    // Fix this!
    london shouldBe london1
  }

  // Null
  test("What about null") {
    divideBy2(MyNumber(6)) shouldBe MyNumber(3)
    divideBy2(MyNumber(5)) shouldBe null
  }
}
