package playground

object TypesValuesVariables extends App {
  val aString: String = "Hello!"
  val aChar = 'C'

  val aInt = 11
  val aLong = 11L
  val aFloat = 2.0f
  val aDouble = 2.0

  val aBoolean = true

  println(aString)

  println(aInt.getClass)
  println(aLong.getClass)
  println(aDouble.getClass)
}
