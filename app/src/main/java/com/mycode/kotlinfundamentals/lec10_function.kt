package com.mycode.kotlinfundamentals

// functions in Kotlin

fun coffeeMachine(sugar : Int, name : String){
    if (sugar == 1 || sugar == 0){
        println("$sugar spoon of sugar added for $name")
    }
    else if (sugar < 0){
        println("$name ! \nPlease put the valid amt of sugar")
    }
    else{
        println("$sugar spoons of sugar added for $name")
    }
}

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

    println("Enter your two numbers to calculate an average ")
    val num1 = readln().toDouble()
    val num2 = readln().toDouble()
    println("Average of two number is ${avg(num1,num2)}")

    println("For whom this coffee made for ?")
    val name = readln()
    println("how much no. of spoon of sugar you want to add in coffee ? ")
    val sugar = readln().toInt()
    // getting input from user in function
    coffeeMachine(sugar, name)

}