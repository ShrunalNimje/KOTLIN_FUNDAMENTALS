package com.mycode.kotlinfundamentals

fun main() {
    // let and nullable in Kotlin
    val name : String? = "Shrunal"
    /*
    Calls the specified function block with this value
    as its argument and returns its result.
     */
    name?.let {
        println(it.uppercase())
    }
}