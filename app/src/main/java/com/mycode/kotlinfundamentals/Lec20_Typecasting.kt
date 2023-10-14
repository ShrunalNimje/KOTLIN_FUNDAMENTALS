package com.mycode.kotlinfundamentals

fun main() {
    val stringList : List<String> = listOf("Av", "Bull", "Boat")
    val charList : List<Char> = listOf('a', 'b', 'c', 'd', 'e')
    val anyList : List<Any> = listOf("Bull", 'c', 'd', 12.34, "Boat", 120)

    for (value in anyList) {
        when (value) {
            is Int -> println("$value is integer")
            is Double -> println("$value is double")
            is Char -> println("$value is character")
            is String -> println("$value is string")
            else -> println("other data")
        }
    }

    // Smart cast
    val a : Any = "Ha ha ha ..."
    if (a !is String)
        println("$a is not a string")
    else
        println("$a is a String and it has length of ${a.length}")

    // Explicit (unsafe) casting using the "as" keyword
    val b : Any = 123.45
//     val c : String = b as String --> throw an error
//     println(c)

    // Explicit (safe) casting using the "as" keyword
    val b1 : Any = 12312.1234123456
//    val c1 : String? = b1 as? String
//    println(c1)  --> it will prints null
    val c1 : Double? = b1 as? Double
    println(c1)

}