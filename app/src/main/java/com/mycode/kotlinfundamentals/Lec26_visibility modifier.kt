package com.mycode.kotlinfundamentals

// Access Modifier or Visibility Modifier

 open class Teacher(){
     // variable "a" is public by default. Whether it is declared or not. It is accessible from anywhere
     val a = 1

     // visible to this class only. cannot accessible from anywhere
     private val b = 2.2f

     // visible to Teacher and Student class only. it is accessible only from class not from main function
     protected val c = "abacus"

     // visible to same module means accessible from class and main function
     internal val d = 123

     protected open fun e(){
     }
}

class Student() : Teacher(){
    // a, c, d, e() are visible from the Teacher class
    // b are not visible
    override fun e() {
    }
}

fun main() {

    /*
    Classes, objects, interfaces, constructors, and functions, as well as properties and their setters, can have visibility modifiers.
    Getters always have the same visibility as their properties.
    There are four visibility modifiers in Kotlin: private, protected, internal, and public.
    The default visibility is public.
     */

    val teacher = Teacher()
    // b -> private, c & e -> protected (cannot accessible from main function)
    println(teacher.a)
    println(teacher.d)

    val student = Student()
    // e -> protected (cannot accessible from main function) because it is protected in Student class also
    println(student.a)
    println(student.d)

}