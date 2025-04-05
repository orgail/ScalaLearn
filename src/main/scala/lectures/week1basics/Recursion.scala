package lectures.week1basics
import scala.annotation.tailrec

object Recursion extends App {
  var i = 0
  while (i < 3) {
    println("hello")
    i += 1
  }
  var iz = 0
  val whileVal = while (iz < 3) {
    println("hello")
    iz += 1
  }
  println(whileVal.getClass)

//  def factorial(n: Int): Int = {
//    if (n <= 0) 1
//    else n * factorial(n - 1)
//  }


  // Простая рекурсия - образуется стек очереди
  private def factorial(n: Int): Int = {
    if (n <= 0) 1
    else {
      println(s"Имеем число $n, для которого считаем факториал ${n-1}")
      var res = n * factorial(n-1)
      println(s"Вычислили факториал $n")

      res
    }
  }

//  https: //www.youtube.com/watch?v=C1zvDBZQ3Aw


//  println(factorial(3))
// Хвостовая рекурсия - отличие в том, что мы сразу в функцию передаём 2 итоговых числа
// т.е. на первой же итерации loop мы получаем значение = loop(2, 3 * 1),
// т.е отличие от простой рекурсии в том, что мы в ответе не храним следующий вызов функции,
// а составляем последовательную очередь выполнения функции с числами.
  def factorial_2(n: Int): Int = {
    @tailrec
    def loop(x: Int, acc: Int = 1): Int = {
      if (x <= 1) acc
      else {
        println(s"Имеем число $x, для которого считаем факториал ${x-1}")
        loop(x-1, x * acc)
      }
    }
    loop(n, 1)
  }

  println(factorial_2(4))

  def factorial2(n: Int): Int = {
    @tailrec
    def loop(x: Int, acc: Int = 1): Int = {
      println(s"$x, $acc")
      if (x <= 1) acc
      else loop(x - 1, x * acc)
    }

    loop(n, 1)
  }

  println(factorial2(4))

  def powerOfTwo(n: Int): Long = {
    @tailrec
    def loop(x: Int, acc: Long = 2): Long = {
      if (x <= 1) acc
      else loop(x - 1, acc * 2)
    }

    loop(n, 2)
  }
  println(powerOfTwo(10))

/*  def factorialWithTailRecursion(n: Int): Int = {
    @tailrec
    def loop(x: Int, accumulator: Int = 1): Int = {
      if (x <= 1) accumulator
      else loop(x - 1, x * accumulator)
    }

    loop(n)
  }

  println(factorialWithTailRecursion(4))*/


  def multiplication(x: Int, y: Int, n: Int): Int = {
    def loop(x: Int = x, y: Int = y, n: Int = n): Int = {
      if (n == 0) x
      else loop(x + y, y, n - 1)
    }

    loop(x, y, n)
  }


  println(multiplication(10, 1, 5))

  def printNTime(x: Int, y: Int, n: Int): Unit = {
    var acc: String = (x + y * n).toString

    def loop(accLength: Int = acc.length, acci: String = acc, accum: String = acc): String = {
      if (accLength == 1) s"${accum} is the result"
      else loop(accLength - 1, acci, s"$acci ${accum}")
    }

    println(loop())
  }

  printNTime(100, 2, 5)
  //   printNTime(fArgs(0), fArgs(1), fArgs(2))


  //  def loop(accLength: Int, acci: String, accum: String): String = {
  //    if (accLength == 1) s"${accum} is the result"
  //    else loop(accLength - 1, acci, s"$acci ${accum}")
  //  }
  //    println(loop(accLength=3, acci="15", accum="15"))


  //  def main(args: Array[String]): Int = {
//    val fArgs = Array(10, 1, 5)
//
//    def loop(a: Int, b: Int, c: Int): Int = {
//      if (c == 1) a + b
//      else loop(a + b, b, c - 1)
//    }
//
//    loop(fArgs(0), fArgs(1), fArgs(2))
//  }
//
//  print(Accumulater(fArgs(0), fArgs(1), fArgs(2) + " ")
//    println (Accumulater(fArgs(0), fArgs(1), fArgs(2) + " is the result")





}
