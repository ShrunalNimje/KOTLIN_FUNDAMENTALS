package com.mycode.kotlinfundamentals

// Exception in Kotlin
// An exception is a runtime problem which occurs in the program

fun main() {
    // exception handling using try - catch block
    try {
        val num = 23
        val divide = num/0
        println(divide)
    }
    catch (e:Exception){
        println("Exception occurred")
    }

    try {
        val array = IntArray(10)
        array[15] = 23
        println(array[15])
    }
    catch (e:Exception){
        println("Array index out of bound exception occurred")
    }

    // multiple try - catch block
    val a = 10
    val b = 10*0
    val sum = a+b
    try {
        println(sum)
    }
    catch (e:ArithmeticException){
        println(e)
    }
    catch (e : ArrayIndexOutOfBoundsException){
        println(e)
    }
    catch (e : Exception){
        println(e)
    }

    // Nested try - catch block
    try {
        val int = 23
        try {
            val divide = int /b
            println(divide)
        }
        catch (e : ArithmeticException){
            println(e)
        }
    }
    catch (e : Exception){
        println(e)
    }

    // use of finally block
    finally {
        println("finally block is always executed")
    }

    // throwing of exception using "throw" keyword
    exception(20)
    exception(15)

}

fun exception(int :Int){
    // throwing of exception using "throw" keyword
   if (int < 18)
       throw Exception("You are younger now")
   else
       println("You are older now")
}