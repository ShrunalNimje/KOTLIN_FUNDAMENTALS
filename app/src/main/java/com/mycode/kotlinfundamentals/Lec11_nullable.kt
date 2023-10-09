package com.mycode.kotlinfundamentals

// nullable in Kotlin

fun main() {
    // nullable
    var name: String = "AaBaCc"
    // name = null --> this will throw an error

    var nullableName: String? = "Shrunal"
    nullableName = null
    // by using this "?" we can assign null to variable

    println(name.length)
    // println("${name.toUpperCase()}")
    println(name.uppercase())

    // we can't do the same method for null
    // println(nullableName.uppercase()) --> throw an error

    var nullableName2: String? = "Adam"
    // println(nullableName2.length) --> this will throw an error
    if (nullableName2 != null){
        println(nullableName2.length)
        println(nullableName2.uppercase())
    }
    else{
        println("Guest")
    }

    // the above code is same as below
    // println(nullableName2.uppercase()) --> this will throw an error
    println(nullableName2?.uppercase())

    // You can use methods on a nullable variable like this
    val nullableName3: String? = null

    println(nullableName3?.lowercase()) // prints null
    println(nullableName3?.length) // prints null

    val nullableName4: String? = null
    nullableName4?.let { println(it.lowercase()) }
    nullableName4?.let { println(it.length) }
    /*
     Prints nothing because there nullableName is null
     and we used let to prevent anything from being performed
     */

    // What if we would like to enter a default value?
    // Then we can use the elvis operator ?:
    val name2 = nullableName4 ?: "Guest"
    println(name2)

    /*
     Not null assertion : !! Operator
     The !! operator converts a nullable type to a
     non-null type, and throws a NullPointerException
     if the nullable type holds a null value.
     This is risky, and you should only use it if
     you are 100% certain, that there will be a value in
     the variable.
     */
    val nullableName5: String? = null
    nullableName5!!.lowercase() // Results in NullPointerException
}