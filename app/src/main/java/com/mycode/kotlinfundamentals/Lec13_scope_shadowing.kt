package com.mycode.kotlinfundamentals

// Scope & Shadowing in Kotlin

var myAge = 24
var myName = "NimJe"

fun mySecFunction(age:Int = 23, name:String = "sn"){
    // here we can assign this two parameter (age & name) to a variables

     // var myAge = age
    // var myName = name
    myAge = age
    myName = name
    println("This is $myName & I'm $myAge year old")

}

fun main() {
    mySecFunction(20,"Shrunal")
    mySecFunction()
    mySecFunction(21)
    mySecFunction(name = "Shrunal Nimje")

}