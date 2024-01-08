package com.mycode.kotlinfundamentals

import kotlin.random.Random

fun main() {

    println("Welcome to Rock, Paper, Scissor Game ! ")
    println("Enter your choice : ")

    val userChoice = readln()
//    println("Opponent chosen : ")
    val randomChoice = (1..3).random()
    var computerChoice = ""

//    if (randomChoice == 1){
//        computerChoice = "Rock"
//    }
//
//    if (randomChoice == 2){
//        computerChoice = "Paper"
//    }
//
//    if (randomChoice == 3){
//        computerChoice = "Scissor"
//    }

    when(randomChoice){
        1 -> computerChoice = "Rock"
        2 -> computerChoice = "Paper"
        3 -> computerChoice = "Scissor"
        else -> println("There must be a error")
    }
//    println(computerChoice)

    val winner = when{
        computerChoice == userChoice -> "Tie ! Play another round"
        computerChoice == "Rock" && userChoice == "Paper" -> "You"
        computerChoice == "Paper" && userChoice == "Scissor" -> "You"
        computerChoice == "Scissor" && userChoice == "Rock" -> "You"
        else -> "Opponent"
    }

    if (userChoice == computerChoice){
        println("Tie ! Play another round")
    }
    else{
        println("Winner is $winner")
    }

    println("Opponent chosen : ")
    println(computerChoice)

}