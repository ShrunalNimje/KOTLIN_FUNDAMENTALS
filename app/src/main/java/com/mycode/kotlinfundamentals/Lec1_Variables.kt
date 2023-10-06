package com.mycode.kotlinfundamentals

// Variables in Kotlin
/*
Variables are immutable when we use "val" keywords
and they are mutable when we use "var" keyword
*/

fun main() {
    // val variable can be used only 1 time
    val v = 123
    println("The value of v is : " + v)

    // In the other hand, var variable can also be used after assign the values or text
    var myName = "Shrunal"
    myName = "Shrunal is Great!"
    print(myName)

}
