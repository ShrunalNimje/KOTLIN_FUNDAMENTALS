package com.mycode.kotlinfundamentals

interface MyInterface{

    val price : Double
    fun average(avg : Double) : String

    fun millage(avg : Double){
        // println("It gives $avg km/l millage")
    }
}

open class Vehicle(var model : String, override val price: Double) : MyInterface{
    var colour : String? = null

    fun brake(speed: Double){
        println("Speed decreased by $speed% after applying brake")
    }

    fun myColour(colour:String){
        println("I bought car which has $colour in colour")
    }

    override fun average(avg: Double): String {
        return "$avg"
    }

    override fun millage(avg: Double) {
        super.millage(avg)
        println("$model gives an average of $avg km/l which $colour in colour")
    }
}

class MyCar(model: String, var speed: Double, price: Double) : Vehicle(model,price){

    fun maxSpeed(mySpeed: Double){
        println("Maximum speed of $model is $mySpeed")
    }

}

fun main() {
    val c = Vehicle("Audi-A3",42.78)
    c.colour = "Blue"
//    c.myColour("Green")
//    c.brake(20.9)
    c.average(25.5)
    c.millage(35.5)


    val c1 = MyCar("Mercedes-Benz C",150.0,78.45)
    c1.speed = 230.4
    c1.colour = "Red & White"
//    c1.maxSpeed(230.560)
//    c1.brake(60.5)
    c1.average(12.23)
    c1.millage(22.25)
}