package com.mycode.kotlinfundamentals

// Classes and Objects in Kotlin

// class MyClass(name:String, age:Int){
class MyClass(name:String = "Ok", age:Int = 12){

    // Initialization block
    init {
        println("Initialization of class")
        println("Name & Age is : $name & $age")
    }
}

// Exercise Classes and Objects
/*
Please create a class called MobilePhone. It should have three primary constructor variables, osName, brand and model.
Use the initializer to print those details.
Create three objects of that class in the Main function.
 */

// solution of exercise
class MobilePhone(osName:String, brand:String, model:String){

    init {
        println("I have a $model phone of $osName OS of $brand brand")
    }

}

fun main() {
    // objects of a class
    MyClass("Shrunal", 20)
    MyClass()
    MyClass("Adam0012")
    MyClass(age = 20)

    // solution of exercise
    val v = MobilePhone("Android","XioMi","Redmi 12")
    val v1 = MobilePhone("iOS","Apple","I phone X")
    val v2 = MobilePhone("Android","RealMe","RealMe 6")

}