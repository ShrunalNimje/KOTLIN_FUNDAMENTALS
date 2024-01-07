package com.mycode.kotlinfundamentals

// If - Else statement in Kotlin

fun main() {
    var age : Int?= null

    println("Enter your age : ")
    age = readln().toInt()

    /*
    readln() used to read the input from the user as a string
    and toInt() used to parses the string as an Int

    val ageInt = readln()
    age = ageInt.toInt()
    */

    // If statement
    if (age>18){
        println("You are eligible to drive")
    }

    // If - Else statement
    if (age>21){
        println("You are eligible to marry")
    }
    else{
        println("You are younger")
    }

    // If - Else-if statement
    if (age>=23){
        println("You are eligible to stand in politics")
    }
    else if (age>=21){
        println("You are eligible to marry")
    }
    else if (age>=18){
        println("You are eligible get licence")
    }
    else{
        println("You are younger")
    }

    // If - Else statement as expression
    var height : Any? = null
    println("Enter your height : ")
    height = readln().toInt()

    val h = if (height>180){
        println("player have more ability to fight with this height")
        // return the value for this block
        180
    }
    else if (height<165){
        println("player have less ability to fight with this height")
        // return the value for this block
        165
    }
    else{
        println("cannot determine has ability or not with this height")
        // return the value of height
        height
    }
    println("the player has above ability with $h cm height")

    println("Enter your age : ")
    age = readln().toInt()

    val currentAge = if (age>=23){
        println("You are eligible to stand in politics")
        // return the value for this block
        23
    }
    else if (age>=21){
        println("You are eligible to marry")
        // return the value for this block
        21
    }
    else if (age>=18){
        println("You are eligible get licence")
        // return the value for this block
        18
    }
    else{
        println("You are younger")
        // return the value of age
        age
    }
    println("Your current age is : $currentAge")

    /*
    Here, in If - else statement condition are executed from top to bottom
    in if - else statement if 1st condition met then next condition will not be executed
    Kotlin provides to assign if - else statement to a variable
     */

}