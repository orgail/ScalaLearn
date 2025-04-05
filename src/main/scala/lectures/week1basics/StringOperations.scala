package lectures.week1basics

object StringOperations extends App {
  var aString: String = "Hello, world!"


  println(aString.length) // выводит 13
  println(aString.charAt(1)) // выводит e
  println(aString.substring(0, 2)) // выводит He
  println(aString.split(" ").toList) // выводит List(Hello,, world!)
  println(aString.startsWith("He")) // выводит true
  println(aString.replace("!", ".")) // выводит Hello, world.
  println(aString.toLowerCase) // выводит hello, world!
  println(aString.toUpperCase) // выводит HELLO, WORLD!
  println("abcd".reverse) // выводит dcba
  println("abcd".take(2)) // выводит ab
  println("example".toUpperCase.take(2)) //

  aString = "Scala course"
  println(aString.take(2))
  println(aString.take(12))
  println(aString.charAt(11))
  //println(aString.charAt(12))
  //println(aString.substring(12, 13))
  println(aString.substring(11, 12))

  val aNumber = "42".toInt
  println(aNumber) // выводит 42
  println(aNumber.getClass) // выводит int

  aString = 42.toString
  println(aString.getClass)  //class java.lang.String

  println('1' +: "42" :+ '3') // выводит 1423
  println('a' +: "bc" :+ 'd') // abcd
  println("a" ++ "bc" :++ "d") // abcd

  var aStr = "42".+:('1')
  println(aStr.:+('3')) // 1423

  aStr = "42".:+('1')
  println(aStr.:+('3')) // 4213

  aStr = '1'.+("42")
  println(aStr.+("3")) // 1423

  //println('3' +: '4') // ошибка - метод на char

  val name = "John"
  println(s"Hello, $name") // выводит Hello, John

  val name2 = "John"
  val surname = "Smith"
  println(s"Hello, ${name2 + surname}") // выводит Hello, JohnSmith

  println(raw"name is some \n name")
  println(s"name is some \n name")


  def reverseString(input: String): Unit = {
    var vRevers = input.split("\\s+").reverse.mkString(" ").trim()
    println(vRevers)
  }

  reverseString("  I like,      Scala")


}
