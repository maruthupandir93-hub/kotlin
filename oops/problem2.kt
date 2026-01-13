package com.example.kotlin.oops

/* Problem:
        Print multiplication tables from 1 to 3
Rules:
        Use nested loops
        Skip printing if result > 10  */

fun main(){
    var num:Int=3
    var table=0
    for(i in 1..num){
        for(j in 1..10){
            table=(i*j)
            println("$i * $j = ${table}")
        }
    }
}
