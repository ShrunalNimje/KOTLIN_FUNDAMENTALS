package com.mycode.kotlinfundamentals

// Lambda expression in Kotlin

fun main() {
   // lambda expression
    // method 1 -
   val sum : (Int, Int) -> Int = {a: Int, b: Int -> a+b}
    println("Sum is "+sum(4,7))
    /*
     In method 1 a & b are two integer and they return integer (a+b)
     so above we have to call sum function with print statement
     */

    // method 2 -
    val avg = {a: Double, b: Int -> println("Average is "+(a+b)/2)}
    avg(12.54,67)
    /*
     In method 2 a & b are two integer and they print average instead of return
    so above we have to just call the avg function
     */

}