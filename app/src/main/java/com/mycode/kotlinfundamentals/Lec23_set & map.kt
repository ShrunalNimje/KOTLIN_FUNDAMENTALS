package com.mycode.kotlinfundamentals

// Sets and Maps in Kotlin

data class Fruit(val color : String, val size : Double)

fun main() {
    // sets
    // val set = setOf<Int>(2,4,6,8)
    // set is type of collection in which duplicate elements are not count
    val set = setOf(2,1,45,32,25,15,45,2)
    println(set)
    // it will return the size of set excluding duplicate element
    println(set.size)
    // it will return set in alphabetical sorted order
    println(set.toSortedSet())

    // to access each element using index
    val fruits = mutableSetOf("Apple","Grape","Banana","Mango")
    for (item in fruits.indices){
        println("${fruits.elementAt(item)} is in index $item")
    }

    // to access a particular element using index
    println(set.elementAt(2))
    // to access a particular index using element
    println(set.indexOf(45))
    // set.add() --> this will throw an error as we know that it is immutable

    val mutSet = set.toMutableSet()
    // to add a element to mutable set
    mutSet.add(78)
    mutSet.add(90)
    println(mutSet)
    // to remove a element
    mutSet.remove(78)


    // maps
    val map = mapOf<Int, String>(1 to "Mon", 2 to "Tues", 3 to "Wed")
    // val map = mapOf(1 to "Mon", 2 to "Tues", 3 to "Wed")
    /*
     In the above map "1" is a key which is integer and "Mon" is value which is string
     A map is a type of collection in which we can get item in key - values pair
     */
    println(map)
    // to print in sorted form of key
    println(map.toSortedMap())

    val bigMap = map.toMutableMap()
    // to add cause there is no add function in "map"
    bigMap[4] = "Thurs"
    bigMap[5] = "Fri"
    println(bigMap)

    val map2 = mapOf(1 to Fruit("Red",4.5), 2 to Fruit("Green",5.5), 3 to Fruit("Orange",6.5))
    println(map2.toSortedMap())
    // to access a particular key - value pair in below code '2' is a "key" not an index
    println(map2[2])

    for (item in map2.keys){
        // println("${map2[item]?.color} & ${map2[item]?.size} is in key $item")
        println("${map2[item]} is in key $item")
    }

}
