package com.mycode.kotlinfundamentals

class BankAccountProgram(var accountHolder : String, var initialAmount : Double) {
    private var showTransactionHistory = mutableListOf<String>()

    fun deposit(amount : Double){
        initialAmount += amount
        showTransactionHistory.add("$accountHolder successfully deposited $$amount in bank")
    }

    fun withdraw(amount : Double){
        if (amount <= initialAmount) {
            initialAmount -= amount
            showTransactionHistory.add("$accountHolder successfully withdraw $$amount in bank")
        }
        else{
            println("You do not have $$amount in bank to withdraw")
        }
    }

    fun transactionHistory(){
        println("Your transaction history : ")

        for (transactions in showTransactionHistory){
            println(transactions)
        }
        println("$accountHolder your total  account balance is : ${acBalance()}")
    }

    fun acBalance() : Double{
        return initialAmount
    }

}


