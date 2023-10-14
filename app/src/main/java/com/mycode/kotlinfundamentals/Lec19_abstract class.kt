package com.mycode.kotlinfundamentals

// abstract class in Kotlin

/*
 An abstract class cannot be instantiated
 (you cannot create objects of an abstract class).
 However, you can inherit subclasses from can them.
 The members (properties and methods) of an abstract class are non-abstract
 unless you explicitly use the abstract keyword to make them abstract.
 */
abstract class Parent(var name: String,var age: Int){

    // properties
    // Abstract Property (Must be overridden by Subclasses)
    abstract var height : Double

    // methods
    // Abstract Methods (Must be implemented by Subclasses)
    abstract fun run(speed : Double)
    abstract fun maxWeight(weight : Double)

    // Concrete (Non Abstract) Method
    fun getDetail(){
        println("Parent class have the following details : \nname $name, age $age & height $height ft")
    }

}

class Child(name: String, age: Int, override var height: Double) : Parent(name,age) {
//    override var height: Double = 5.8

    override fun run(speed: Double) {
        println("$name have the ability to run with $speed km/hr of speed")
    }

    override fun maxWeight(weight: Double) {
        println("$name need $weight kg weight for national championship")
    }

    fun meth1(){
        println("This is meth1")
    }

}

class ChildOfAnimal(name: String, age: Int, override var height: Double) : Parent(name, age,){

    override fun run(speed: Double) {
        println("$name can run with $speed km/hr of speed")
    }

    override fun maxWeight(weight: Double) {
        println("$name have $weight kg weight")
    }

}

fun main() {
    val a = Child("Devil",8,3.2)
    a.age = 10
    a.getDetail()
    a.run(25.0)

    val b = ChildOfAnimal("Elephant",20,6.8)
    b.height = 7.2
    b.maxWeight(305.0)

}