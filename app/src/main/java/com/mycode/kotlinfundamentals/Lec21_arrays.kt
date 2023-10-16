package com.mycode.kotlinfundamentals

// Arrays in Kotlin

data class Month(val name : String,val day : Int){
    // code or statement
}

fun main() {
    // IntArrays
    // val i : IntArray = intArrayOf(1,2,3,4,5,6,7,8,9)
    // val i = intArrayOf(1,2,3,4,5,6,7,8,9)
    val i = arrayOf(1,2,3,4,5,6,7,8,9)
    // println(i) --> this will print an address of array
    // to print whole array
    println(i.contentToString())

    // to access particular element of an index
    println(i[2])
    println(i[3])
    println(i[7])
    println(i[8])

    // to access particular element of an index using for loop
    for (e in i){
        print("${e+5}\t")
    }

    // we are not able to resize the array but we can modify the element at particular index
    println("\nbefore changes in array ${i.contentToString()}")
    i[1] = 13
    i[3] = 34
    i[7] = 56
    i[0] = 25
    i[4] = 78
    println("after changes in array ${i.contentToString()}")

    // DoubleArray
    val d = doubleArrayOf(1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9)
    println(d.contentToString())

    // AnyArray
    val any = arrayOf(12,13.4f,123.456,'s',"Shrunal")
    println(any.contentToString())
//    for (i in any.indices)
//        println(any[i])

    // above code similar to below one
    for (ij in any)
        println(ij)

    // mix type array
    val anyType = arrayOf(1,2.2,'a',"sn",Month("Jan",30),Month("Feb",28))
    println(anyType.contentToString())

    // to access each element
    for (value in anyType.indices) {
        println(anyType[value])
    }

    val months = arrayOf(Month("Jan",30),Month("Feb",28))
    // to access particular month and days in a particular index
    for (s in months.indices) {
        println("${months[s].name}  month is in index $i and\nit has ${months[s].day} days")
    }

}