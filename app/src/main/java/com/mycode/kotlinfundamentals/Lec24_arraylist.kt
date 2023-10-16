package com.mycode.kotlinfundamentals

// ArrayList in Kotlin

fun main() {

    // empty arraylist
    val myArrayList : ArrayList<Any> = arrayListOf()
    myArrayList.add(23)
    myArrayList.add(45)
    myArrayList.add(67)
    myArrayList.add(29)
    myArrayList.add(14)
    println(myArrayList)
    // returns all element of a using for loop
    for (i in myArrayList)
        println(i)

    // arraylist using collections
    val myArraylist1 : ArrayList<String> = ArrayList<String>(5)
    val list : MutableList<String> = mutableListOf()
    list.add(0,"This is ")
    list.add(1,"Shrunal ")
    list.add(2,"Nimje")
    println(list)
    myArraylist1.addAll(list)
    // printing by using for loop
    for (element in myArraylist1){
        print(element)
    }
    println()

    // Filled elements in ArrayList using collections
    val itr = myArraylist1.iterator()
    println("This is an iterative arraylist")
    while (itr.hasNext()){
        println(itr.next())
    }


    // Exercise arraylist
    /*
    Please write a program that adds five Numbers (Double) to an arrayList and then calculates the average of those numbers.
    Please use a for (in) loop in this exercise.
     */

    // solution of exercise
    val arrayList: ArrayList<Double> = ArrayList()
    arrayList.add(23.3)
    arrayList.add(24.7)
    arrayList.add(2.3)
    arrayList.add(67.2)
    arrayList.add(100.0)

    var sum = 0.0
    for (i in arrayList) {
        println(i)
        sum += i
    }

    val average = sum/arrayList.size
    println("Average is $average")

}