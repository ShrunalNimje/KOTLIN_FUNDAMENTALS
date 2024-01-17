package com.mycode.kotlinfundamentals

fun main() {

    // Map function in Kotlin
    /*
    Returns a list containing the results of applying the given transform function
    to each element in the original collection
     */
    val number = listOf<Int>(1,2,3,4,5)
    print("Map function is : " + number.map {
        it * 3 }
    )
}