package lectures.week1basics

object TypesValuesVariables extends App {
  var aString: String = "Hello!"
  aString = "Hello, world!"
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
  val aStr = "42".+:('1')
  println(aStr.:+('3'))  // 1423

  val aStr2 = "42".:+('1')
  println(aStr2.:+('3')) // 4213

  println("1" + "42" + "37")
  println(1 + 2 * 3) // 7

  println('1' +: "23") // 123
  println("1" :+ "23") // Vector(1, 23)
  println("1" + "23") // 123

  println("1".+:("23")) // Vector(23, 1)
  println("1".:+("23")) // Vector(1, 23)


  //  Byte[8 битовое знаковое значение .Диапазон от -128 до 127  ]
//  Short[16 битовое знаковое значение.Диапазон от -32768 to 32767  ]
//  Int[32 битовое знаковое значение.Диапазон от -2147483648 to 2147483647  ]
//  Long[64 битовое знаковое значение.Диапазон от -9223372036854775808 to 9223372036854775807  ]
//  Float[32 битовое IEEE  754 число с плавающей точкой одинарной точности  ]
//  Double[64 битовое IEEE  754 число с плавающей точкой двойной точности  ]
//  Char[16 битовое беззнаковый символ Unicode.Диапазон от U + 0000 to U + FFFF]
//  String[Последовательность экземпляров Char]
//  Boolean[Логическое буквенное значение true или false  ]
//  Unit[Соответствует отсутствию значения]
//  Null[Null или пустая ссылка  ]
//  Nothing[Подтип любого другого типа, включает в себя отсутствие значения.  ]
//  AnyRef[Супертип любого ссылочного типа.]
  

}
