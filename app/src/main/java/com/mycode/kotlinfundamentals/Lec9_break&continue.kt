package com.mycode.kotlinfundamentals

// break & continue in Kotlin

fun main() {
    // break statement
    for (i in 30.downTo(3).step(3)){
        print("$i ")
        if (i<=18){
            println("\nConcept of break done")
            // the break statement are used to jump from the loop when certain condition met or not
            break
        }
    }

    // continue statement
    for (i in 0.until(20).step(2)){
        if (i==10){
            println("Concept of continue done")
            // the continue statement are used to skip the code below the continue keyword & go to next iteration
            continue
        }
        println("$i is $i")
    }

}