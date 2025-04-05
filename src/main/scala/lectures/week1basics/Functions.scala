package lectures.week1basics

object Functions extends App {

  def aPerson(name: String, surname: String): String = {
    s"$name $surname"
  }
  println(aPerson("John", "Smith"))

  def aPerson2(name: String, surname: String): Unit = println(s"$name $surname")
  aPerson2("John" , "Smith")

  def aParameterlessFunction(): Unit = println("Function with no parameters")

  aParameterlessFunction()
  //aParameterlessFunction // выдаёт ошибку

  def aFunctionWithDefaultParameter(x: Int, y: String = "Default Parameter"): String = {
    s"x = $x and y = $y"
  }

  println(aFunctionWithDefaultParameter(1)) // выводит x = 1 and y = Default Parameter

  def callByValue(x: Long): Unit = {
    println(s"call by value: x1 = $x")
    println(s"call by value: x2 = $x")
  }

  def callByName(x: => Long): Unit = {
    println(s"call by name: x1 = $x")
    println(s"call by name: x2 = $x")
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  def aCondition(): Boolean = if ( 1 < 2) true else false

  println(aCondition())

  def someFunnc(x: Int, y: => Int): Unit = {
    def aCondition(): Boolean = if ( 1 < 2) true else false
    if aCondition() then println(x * 2)
    else println(y)
  }

//  println(if (aCondition()) 2 * 2 else 3)
  someFunnc(3, 4)

  val someVal = print("It is just a value")
  println(someVal)

  val someVal2: Unit = print("It is just a value")
  println(someVal2)

}


// исправьте код
//def aCondition(): Boolean = if ( 1 > 2) true else false
//
//def someFunnc(x: Int, y: => Int): Unit = {
//  if (aCondition()) x * 2
//  else  multiply(y)
//}
//


