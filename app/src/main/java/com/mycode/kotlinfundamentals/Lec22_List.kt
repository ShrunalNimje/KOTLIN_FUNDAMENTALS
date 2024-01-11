package com.mycode.kotlinfundamentals

// List in Kotlin

fun main() {
    // immutable list
    // val list = listOf<Int>(1,2,3,4,5)
    val list = listOf(1,2,3,4,5)
    println(list)

    // to access all element using for loop
    for (item in list){
        println(item)
    }

    // to access a particular element
    // println(list.get(2)) --> it is similar to below one
    println(list[2])

    // list.add() --> this will throw an error as we know it is immutable

    // val months = mutableListOf<String>("Jan", "Feb", "March")
    val months = mutableListOf("Jan", "Feb", "March")
    // since this is a mutable list so we can add item to it
    months.add("April")
    val month1 = listOf("May", "June", "July")

    println("For loop in list : ")
    for(item in 0 until months.size){
        println(months[item])
        if (months[item] == "Feb"){
            println("it's feb")
            break
        }
    }

    // to override element at particular index
    months[1] = "Dec"
    months.addAll(month1)
    println("After adding all elements of months1 list : $months")

    // return the size or length of list
    println(months.size)

    // to remove element at particular index
    months.removeAt(2)
    // to remove direct element of month list
    months.remove("Dec")
    println("After removing elements of months list : $months")

    months.set(4,"Dec")
    println(months)

    // return true if both will true
    // println(months == month1)
    println(months.equals(month1))

    // to set element at particular index
    println(months.set(2,"Nov"))
    println(months)

    // to remove all element of months list
    months.removeAll(months)
    println("after removing all elements : $months")

     /*
     there are multiple methods which are used by kotlin
     this are just few of this
      */

    // Quiz for list
    val fruits = mutableListOf<String>("Apple", "banana", "orange", "grapes")
    println(fruits)
    fruits.add(2,"dragon fruit")
    println(fruits)
    fruits.remove("grapes")
    println(fruits)
    if (fruits.contains("grapes")){
        println("grapes are in fruit list")
    }
    else{
        println("grapes doesn't contain in fruit list")
    }

}