package lectures.week1basics
import scala.annotation.tailrec

object SelfTest extends App {
//  def powerOfTwo(x: Int, y: Int, n: Int): String = {
//    @tailrec
//    def loop(x: Int, acc: Long = 2): Long = {
//      if (x <= 1) acc
//      else loop(x - 1, acc * 2)
//    }
//    loop(n, 2)
//  }
//
//  println(powerOfTwo(10))




// переписываем на рекурсию


def reverseString(input: String): Unit = {
  var vRevers = input.split("\\s+").reverse.mkString(" ").trim()
  println(vRevers)
}
  reverseString("  I like,      Scala")

  println("  I like,      Scala".trim.replaceAll(" +", " ").split(" ").reverse.mkString(" "))
  println("  I like,      Scala"
    .split(" +")
    .reverse
    .mkString(" "))

  println("  I like,      Scala".trim().replaceAll("\\s+", " ").split(" ").reverse.mkString(" "))
  print("  I like,      Scala".replaceAll("\\s+", " ").split(" ").toList.reverse.mkString(" "))

//  object ReverseStringExample {
//    def main(args: Array[String]): Unit = {
//      val originalString = "I like Scala"
//
//      // Разделяем строку на слова
//      val words = originalString.split(" ")
//
//      // Переворачиваем порядок слов
//      val reversedWords = words.reverse
//
//      // Объединяем обратно в строку
//      val reversedString = reversedWords.mkString(" ")
//
//      println(reversedString) // Вывод: Scala like I
//    }
//  }




}
