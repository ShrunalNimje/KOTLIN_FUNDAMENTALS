package com.mycode.kotlinfundamentals

// Loops in Kotlin

fun main() {
    // while loop
    // While loop executes a block of code repeatedly as long as a given condition is true
    var n = 1
    while (n<=12){
        print("$n ")
        n++
    }
    println("\nWhile loop is done!")

    var num = 100
    while (num>=10){
        print("$num ")
        num-=5
    }
    println("\nWhile loop is done!")

    var currentSeason = "cold"
    var temp = 23
    while (currentSeason == "cold"){
        // println("$currentSeason is current season")
        temp++
        if (temp>=40){
            currentSeason ="Summer"
            println("$currentSeason is current season")
        }
    }
    println("Another while loop is done")

    // do - while loop
    /*
     The do-while loop is similar to while loop except that
     it tests the condition at the end of the loop.
     This means that it will at least execute the body once
     */
    var v = 2
    do {
        print("$v ")
        v++
    }while (v<=12)
    println("\ndo while loop is done!")

    var v1 = 200
    do {
        print("$v1 ")
        v1-=10
    }while (v1>=12)
    println("\ndo while loop is done!")

    // for loop
    /*
     A for-loop is used to iterate through ranges, arrays, collections, or anything
     that provides an iterator
     */
    for (i in 1..20){
        print("$i ")
    }
    println("\nfor loop is done!")

    // infix notation
    // for (num in 1 until 20){ --> both line are same
    for (num in 1.until(20)){
        print("$num ")
    }
    println("\nfor loop is done!")

    for (num1 in 20. downTo (0).step(2)){
    // for (num1 in 20 downTo 0 step 2){ --> both line are same
        print("$num1 ")
    }
    println("\nfor loop is done!")

    // Exercise
    /*
    1.Write a for loop that runs from 0 to 10000
    Once it's at 9001 it should write "IT'S OVER 9000!!!"

    2.Write a while loop that checks the humidity (not the humidityLevel). The variable humidityLevel starts at 80.
    The variable humidity is initialized with "humid".
    If it is "humid" then it should reduce the "humidityLevel" by 5 and print "humidity decreased"
    Once the humidityLevel is below 60 it should print "it's comfy now" and set the humidity to "comfy"
     */

    // solution of problem 1
    for (i in 0..10000){
        // print("$i ")
        if (i==9001){
            println("IT'S OVER 9000!!!")
        }
    }

    // solution of problem 2
    var humidity = "humid"
    var humidityLevel = 80
    while (humidity == "humid"){
        humidityLevel-=5
        println("Humidity decreased!")
        if (humidityLevel<60){
            humidity = "comfy"
            println("it's $humidity now")
        }
    }

}