package lectures.week1basics

object Expressions extends App {
  val aVal: Int = 1 + 2 * 3
  println(aVal)

  val aCondition = true

  val ifExpressionValue = if (aCondition) "True Condition" else "False Condition"
  println(ifExpressionValue) // выведет True Condition

  val someVal: Unit = println("I just want to print")
  println(someVal.getClass) // void
  println(s"$someVal".getClass) // выводит () class java.lang.String
  val aNumber = if (("string".length == 6 & 1 < 2) &('1' +: "23" :+ '4').toInt == 1234) 24 else 123
  println(aNumber)

  val aCodeBlock = {
    val someVal = 1
    val y = 2

    if (someVal + y > 1) true else false

    "String to return"
  }

  println(aCodeBlock) // выводит "String to return"
}
