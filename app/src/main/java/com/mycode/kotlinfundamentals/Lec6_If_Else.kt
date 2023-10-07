package com.mycode.kotlinfundamentals

// If - Else statement in Kotlin

fun main() {
    var age = 20

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
    val height = 172
    val h = if (height>180){
        println("player have more ability to fight with this height")
        180
    }
    else if (height<165){
        println("player have less ability to fight with this height")
        165
    }
    else{
        println("cannot determine has ability or not with this height")
        height
    }
    println("the player has above ability with $h cm height")

    age = 34
    val currentAge = if (age>=23){
        println("You are eligible to stand in politics")
        23
    }
    else if (age>=21){
        println("You are eligible to marry")
        21
    }
    else if (age>=18){
        println("You are eligible get licence")
        18
    }
    else{
        println("You are younger")
        age
    }
    println("Your current age is : $currentAge")
}