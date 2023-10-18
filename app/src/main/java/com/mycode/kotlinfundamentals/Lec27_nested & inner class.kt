package com.mycode.kotlinfundamentals

// Nested and Inner class

// NestedClass
class OuterClass(){
    val a = 2
    fun meth(){
    }

    class NestedClass(){
        val detail = "This is a Nested class..."
        private val id = 234
        fun meth2(){
            println("Id is $id")
        }
    }

}

// InnerClass
class OuterClass1(){
    val a = 'a'
    private val status = "Rich"
    fun meth(){
    }

    inner class InnerClass(){
        val details = "This is a Inner class..."
        private val age = 20
        fun meth2(){
            // by using inner class we are able to access properties of OuterClass1 even private
            println("Age is $age and status is $status")
        }
    }

}

fun main() {
    val obj = OuterClass()
    obj.a

    // to access the property of nested class
    println(OuterClass.NestedClass().detail)
    val obj1 = OuterClass.NestedClass()
    println(obj1.meth2())

    // to access the property of inner class
    println(OuterClass1().InnerClass().details)
    val obj2 = OuterClass1().InnerClass()
    println(obj2.meth2())

    /*
    NestedClass
    Nested class is a class which is created inside another class
    but nested class are not able to access the properties of OuterClass.
    Nested class is by default static, so we can access the properties and members of nested class without creating an object.

    InnerClass
    inner class is a class which is created inside another class with keyword "inner".
    nested class is said to be inner class when we add inner keyword before it
     */

}