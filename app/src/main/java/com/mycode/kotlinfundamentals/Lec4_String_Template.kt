package com.mycode.kotlinfundamentals

// String template expression or String interpolation

fun main(){
    val str = "Shrunal"
    val length = str.length
    val a = str[0]
    val b = str[length-1]
    // use of String interpolation
    print("First & Last element is $a & $b and length of str is $length")

    /*
    In String interpolation, we don't have add '+' operator and then variable name
    Here we have to add '$' sign with variable name
    It is generally useful when we have to print multiple variable of different datatype
     */

}