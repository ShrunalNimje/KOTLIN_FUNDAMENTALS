package com.mycode.kotlinfundamentals

  // Inheritance in Kotlin

open class Animal(colour : String?, height : Double?){
    // properties
    var nameOfAnimal : String = "Horse"
    var weightOfAnimal : Double = 20.34
    open var speedOfAnimal : Double = 67.89

    // methods
    open fun maxSpeed(speed: Double){
        var s = 0.0
        if (speed>20)
            s = speed+speedOfAnimal
        println("Maximum speed of $nameOfAnimal is $s")
    }

    fun minWeight(weight:Double){
        var w = 0.0
        if (weight>50)
            w= weight-weightOfAnimal
        println("Minimum weight of $nameOfAnimal is $w")
    }

}

class Dog(colour : String, height : Double, speed : Double) : Animal(colour, height){
    // override property
    override var speedOfAnimal : Double = 12.89

    // method
    fun colour(colour: String?){
        if (colour==null)
            println("this $nameOfAnimal have no colour")
        else
            println(colour)
    }

    override fun maxSpeed(speed: Double){
        var s = 10.0
        if (speed>30)
            s = speed+speedOfAnimal
        println("Maximum speed of override $nameOfAnimal is $s")

    }

}

fun main() {
    val obj1 = Animal(null,null)
    obj1.nameOfAnimal = "Cat"
    obj1.weightOfAnimal = 20.25
    obj1.maxSpeed(40.45)
    obj1.nameOfAnimal = "Tiger"
    obj1.minWeight(55.56)

    val obj2 = Dog("Red",2.2,30.34)
    obj2.nameOfAnimal = "Dog"
    obj2.colour(null)
    obj2.colour("Brown")
    obj2.maxSpeed(20.25)
    obj2.minWeight(30.0)
    obj2.maxSpeed(40.45)

}