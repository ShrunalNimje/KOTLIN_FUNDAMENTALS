package com.mycode.kotlinfundamentals

import android.graphics.Color

fun main() {
    // Copy class in Kotlin
    /*
    Copy class is used to create a copy of object without changing the original one
    We are able to modify the parameter also
     */
    val firstCopy = Pot("Red", "Rose")
    val secondCopy = firstCopy.copy("Blue")
    println(firstCopy)
    println(secondCopy)
}
data class Pot(val color: String, val design : String){

}