package com.mycode.kotlinfundamentals

// when statement in Kotlin

/*
 Kotlin’s "when" expression is the replacement of the switch statement
 from other languages like C, C++, and Java.
 It is compact and more powerful than switch statements.
 */

fun main() {
    val age = 20

    // when statement
    when(age){
        20 -> println("You're 20")
        18 -> println("You're adult")
        16 -> println("You're now in 10th std")
        14 -> println("You're now in 8th std")
        else -> println("You're younger")
    }

    // when statement with "in" keyword
    when(age){
        !in 23..60-> println("You are not eligible to stand in politics")
        in 18..22 -> println("You may have licence")
        15,16,17-> println("You may be at school or college")
        else -> println("You're to younger")
    }

    // when statement with "is" keyword
    val type: Any = "12.234 Shrunal"
    when(type){
        !is Int -> println("$type is not an integer")
        is Double -> println("$type is a double")
        is String -> println("$type is a string")
        is Char -> println("$type is a character")
        else -> println("$type is non of the above")
    }

    // when statement as an expression
    val data: Any = 3.142
    val result = when(data){
        is Int -> "integer"
        !is String -> " not a string"
        is Double -> "double"
        is Char -> "character"
        else -> "non of the above"
    }
    print("$data is $result")

    /*
    Here, in "when" expression condition are executed from top to bottom
    in "when" expression if 1st condition met then next condition will not be executed
    Kotlin also provides to assign when expression to a variable
     */

}