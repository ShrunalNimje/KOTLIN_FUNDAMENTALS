package com.mycode.kotlinfundamentals

// Members in Kotlin

class Person(name:String = "Bhavanish", age:Int = 23){
    // member variables - Properties
    var name : String = "Anushka"
    var age : Int? = null
    var state : String? = null
    var contry : String = "India"
    var myHobby : String = "to do Coding"

    init {
        this.name = name
        print("This is $name and ")
        println("Now I'm $age year old")
    }

    // member functions - Methods
    fun stateHobby(){
        println("$name\'s hobby is $myHobby and I'm from $state, $contry")
    }

    // member constructors
    constructor(name: String, age: Int, contry: String) :this(name, age){
        this.name = name
        this.age = age
        this.contry = contry
//        print("This is $name and ")
//        println("Now I'm $age year old")
    }
}

fun main() {
    val shrunal = Person("Shrunal Nimje",age = 20)
    shrunal.state = "Maharashtra"
    shrunal.stateHobby()

    val bhavanish = Person()
    bhavanish.state = "Delhi"
    bhavanish.contry = "India"
    bhavanish.myHobby = "play cricket"
    bhavanish.stateHobby()

    val anushka = Person("Anushka",18,"India")
    anushka.state = "Maharashtra"
    anushka.myHobby = "dancing"
    anushka.stateHobby()

}