package com.mycode.kotlinfundamentals

// Safe and Unsafe Operator in Kotlin

fun main() {
    // Unsafe cast operator - "as"

    val a : Any? = null
    val b : String = a as String
    // this will throw an null pointer exception, null cannot be cast to non-null type kotlin string
    println(b)

    val a1:Any = 123
    val b1:Int = a1 as Int
    println(b1)

    val a2: Any = "Shrunal"
    val b2: Double = a2 as Double
    // this will throw an class cast exception, String cannot be cast to double type
    println(b2)

    val a3: Any? = 123.34f
    val b3:String = a3 as String
    // this will throw an class cast exception, Float cannot be cast to String type
    println(b3)

    val a4:Any? = 234
    val b4:Int? = a4 as Int?
    // this will work
    println(b4)

    // Safe operator - "as?"

    val obj:Any = 1234
    val obj1:String? = obj as? String
    println(obj1)

    val obj2:Any? = 34.56
    val obj3:String? = obj2 as? String?
    println(obj3)

}