package com.mycode.kotlinfundamentals

fun main() {
    val newObj = DogClass("Cage", "Rottweiler")
    newObj.dogAge(0)
    val newObj1 = DogClass()
}

class DogClass constructor(var name : String = "Yes", var breed : String = "No") {

    init {
        name = "Ooo!"
        breed = "Labrador"
        println("Hii, my name is $name of breed $breed")
        bark()
    }

    fun dogAge(age : Int){
        println("Hey! I am $age years old")
    }

}

fun bark(){
    println("hey! Woof Woof...")
}