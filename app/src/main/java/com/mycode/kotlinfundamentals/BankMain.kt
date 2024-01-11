package com.mycode.kotlinfundamentals

fun main() {
    // creating first object
    println("Enter your account holder name : ")
    // to get user input for name
    val name : String = readln()
    val firstObj = BankAccountProgram(name, 1200.00)

    println("How much amount of money you want to deposit ?")
    // to get user input for deposit money
    val depositAmount : Double = readln().toDouble()
    firstObj.deposit(depositAmount)

    println("How much amount of money you want to withdraw ?")
    // to get user input for withdraw money
    val withdrawAmount : Double = readln().toDouble()
    firstObj.withdraw(withdrawAmount)

    firstObj.transactionHistory()


    // creating second object
    val secObj = BankAccountProgram("Sarah", 00.00)
    println("Account holder name is ${secObj.accountHolder}")
    secObj.deposit(100.00)
    secObj.withdraw(10.00)
    secObj.deposit(300.00)
    secObj.transactionHistory()

}