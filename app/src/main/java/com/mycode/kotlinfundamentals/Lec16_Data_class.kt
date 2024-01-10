package com.mycode.kotlinfundamentals

// data class in Kotlin

data class CoffeeDetails(var sugar : Int, val name : String){
    init {
        println("$sugar no. of spoon added for $name")
    }

}

data class One(var id: Int,var age:Int,var name:String){
    // data class must have minimum one parameter

    init {
        println("data class have the following details:\nid = $id\nage = $age\nname = $name")
    }
}

// Challenge - Classes
/*
Add a member to it, which indicates how much battery is left (call it "battery". Initialize this value with a number between 0 and 50.
Then add a function
"chargeBattery"
Which needs details about how much was charged.
It should print out how much battery the phone had before, how much was charged and how much it has now.
Create an Object of the class and call this function. Charge the battery by 30.
 */

// solution of Challenge - Class
class MyMobilePhone(osName: String, brand: String, model: String){

    // member variable - properties
    var battery : Int = 30

    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

    fun chargeBattery(chargeBy : Int){
        print("before charge it has $battery% ")
        battery+=chargeBy
        println("then phone charge by $chargeBy% and now it have $battery%")
    }

}

fun main() {
    val meth1 = One(2,21,"Shrunal")
    meth1.id = 3
    meth1.age = 20

    val meth2 = One(3,45,"abacus")
    // prints true if both the objects are equal
    println(meth1.equals(meth2))

    val meth3 = One(3,20,"Shrunal")
    // prints true if both the objects are equal
    println(meth1 == meth3)

    // it prints the whole detail of meth1 object
    println("meth1 details: $meth1")

    // it makes a copy of that object
    // and we are able to modify the attributes that has been passed
    val updatedMeth1 = meth1.copy(age = 69)
    println("difference in between this two variable as objects are :")
    println(meth1)
    println(updatedMeth1)

    // we can get the component of our objects
    // .i.e, value which is assign to a parameters
    println(meth2.component1())
    println(meth2.component3())
    println(meth2.component2())

    val (id,age) = updatedMeth1
    println("id is $id & age is $age")

    // above are the different types of method which are used in data class


    // solution of Challenge - Class
    val phone = MyMobilePhone("Android","XioMi","Redmi Note 7s")
    phone.chargeBattery(14)

    val myCoffee = CoffeeDetails(-2,"Shrunal")
    myCoffee.sugar = 2
    coffeeMachine(myCoffee)

}