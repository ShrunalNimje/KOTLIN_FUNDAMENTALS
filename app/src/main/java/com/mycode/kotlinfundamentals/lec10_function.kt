package com.mycode.kotlinfundamentals

// functions in Kotlin

fun myFunction(){
    println("This is my custom function")
}

// function to add two integer
/*
 This function has two parameters and returns a value of type Int
 here a & b are two parameters of Int type
 */

fun add(a:Int,b:Int):Int{
    val c = a+b
    /*
     the return keyword indicates that this function will return the following value
     once this function is called and executed
     */
    return c
}

// function to calculate avg of two numbers
// here a & b are two parameters of Double type
fun avg(a:Double,b:Double):Double{
    return (a+b)/2
}

fun main() {
    // function
    myFunction()
    // here 23 & 56 are two attributes
    val add = add(23,56)
    println("Addition is $add")
    // here 23.75 & 45.0 are two attributes
    println("Average of two number is ${avg(23.75,45.0)}")

}