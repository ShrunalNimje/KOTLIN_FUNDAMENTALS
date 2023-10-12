package com.mycode.kotlinfundamentals

// late-init and getter & setter in Kotlin

class GetSet(){
    // late-init
    /*
     here we have to initialize the name variable
     but we can use the late-init
     by using this we can initialize this later on
     */
    lateinit var state : String

    var brand : String = "sher hu me"
        // custom getter
    get() {
        return field.uppercase()
    }

        set(value) {
            field = value
        }

    var model : String = "S20"
        private set
    var maxSpeed : Int? = 34


    // custom getter
    get() {
        return field
    }

    // custom setter
    set(value) {
            if (value != null) {
                field = if(value > 0) value else throw
                IllegalArgumentException("_maxSpeed must be greater than zero\n maximum speed can't be negative")
            }
    }

    // initialization block
    init {
        this.state = "maharashtra"
        this.maxSpeed = maxSpeed
        this.model = model
    }

}

fun main() {
    val myGetSet = GetSet()
    // we can't assign or access the value of variable before initialize
    println("I'm from ${myGetSet.state} state")

    val myGetSet1 = GetSet()
    // myGetSet1.maxSpeed = -78
    println("Max Speed is ${myGetSet1.maxSpeed} km/hr")

    val myGetSet2 = GetSet()
    // we can't assign or set the value of private
    // myGetSet2.model = "SN21" --> throw an error

    // but we can get this model since it is private
    println("New model is ${myGetSet2.model}")
    myGetSet2.brand = "SIP"
    println(myGetSet2.brand)

    /*
    1. value
    We use value as the name of the setter parameter.
    This is the default convention in Kotlin but you’re free to use any other name if you want.
    The value parameter contains the value that a property is assigned to. For example, when you write user.name = "Elon Musk",
    the value parameter contains the assigned value "Elon Musk".

    2. Backing Field (field)
    Backing field helps you refer to the property inside the getter and setter methods.
    This is required because if you use the property directly inside the getter or setter then you’ll
    run into a recursive call which will generate a StackOverflowError.
     */

}