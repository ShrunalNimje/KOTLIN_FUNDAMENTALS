package com.mycode.kotlinfundamentals

// Datatype in Kotlin
// kotlin is a strongly typed language that supports Type Inference
// TODO : DATATYPE IN KOTLIN...

fun main(){

    // Integer : Byte (8 Bytes), Short (16 Bytes), Int (32 Bytes), Long (64 Bytes)
    val v: Byte = 127
    val v1: Short = 12345
    val v2: Int = 1234567890
    val v3: Long = 1234567890123456789

    // Float point : Float (32 Bytes), Double (64 Bytes)
    val f: Float = 23.45454f
    // In case of float we have add "f or F" in the last, otherwise it will be assume as double
    val f1: Double = 1234.234567

    // String : It is a collection of characters
    val s: String = "Hey, this is Shrunal!"
    // to access the element of a string
    val c2 = s[0]
    val c3 = s[s.length-1]
    println("First element : "+c2)
    println("Last element : "+c3)

    /* Character : we can assign any single value, symbols or character
       in case of to assign a symbols we can use the unicode using the backslash
    */
    val c: Char ='S'
    val c1: Char = '#'

    val myChar = '\u00A9' // --> here 00A9 is unicode of output which has displayed
    println(myChar)

    // Boolean : It has two probabilities which is either true or false
    val b: Boolean = true
    val b1: Boolean = false

    // Unsigned : it used when we want to assign only positive values starts from '0'
    var age : UByte = 21u
    println(age)
    age = 37u
    println(age)

    /*
    But we don't have to do the above things
    In Kotlin we can directly assign any value to the variable
    Kotlin have an ability to store any type of data to a variable
    It knows, which types of data is assign
    */

}
