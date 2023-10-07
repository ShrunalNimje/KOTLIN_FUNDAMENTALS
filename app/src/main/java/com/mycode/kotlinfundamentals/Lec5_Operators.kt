package com.mycode.kotlinfundamentals

// Operators in Kotlin

fun main(){
    // Arithmetic Operators : ( "+", "-", "*", "/", "%" )
    val add = 3+8.0
    println("Addition is : $add")

    val sub = 12.0-3
    println("Subtraction is : $sub")

    val mul = add*sub
    println("Multiplication is : $mul")

    // to get the value in point
    val div :Double= add/sub
    println("Division is : $div")

    val mod :Double= mul%div
    println("Remainder or modulo is : $mod")

    // Comparison Operators : ( "= =", "! =", ">", "<", "> =", "< =" )
    val isEqual = 3==4
    println("isEqual is : $isEqual")

    val isNotEqual = 3!=4
    println("isNotEqual is : $isNotEqual")

    println("is 4 Greater than 3 : ${4 > 3}")

    println("is 43 Less than 3 : ${43 < 3}")

    println("is 4 Greater than or Equal to 3 : ${4 >= 3}")

    println("is 44 Less than or Equal to 33 : ${44 <= 933}")

    // Assignment Operators ( "=", "+=", "-=", "*=", "/=", "%=" )
    // to get the actual value in points
    var a = 3.0
    println(a)

    a+=2
    println(a)

    a-=1
    println(a)

    a*=8
    println(a)

    a/=3
    println(a)

    a%=4
    println(a)

    // Increment & Decrement Operator : ( "++", "--" )
    /*
    Ex: a++ = First assign then increment by 1 in next line
        ++a = First increment by 1 then assign
        b-- = First assign then decrement by 1 in next line
        --b = First decrement by 1 then assign
     */
    var num = 3
    println(num)

    num++
    println(num)

    ++num
    println(num)

    num--
    println(num)

    --num
    println(num)

}