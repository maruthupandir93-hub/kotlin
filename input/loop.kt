package com.example.kotlin.input

// 1.Print numbers from 0 to N
fun main() {
    var n:Int = readLine()!!.toInt()
    for(i in 0..n){
        print("$i ")
    }
}

// 2.Print numbers from 0 to N in reverse order
fun main() {
    var n:Int = readLine()!!.toInt()
    for(i in n downTo 0){
        print("$i ")
    }
}


// 3.Print all odd numbers between 0 to N
fun main() {
    var n:Int = readLine()!!.toInt()
    for(i in 0..n){
        if(i%2==0){
            print("$i ")
        }
    }
}


// 4.Print all even numbers between 0 to N
fun main() {
    var n:Int = readLine()!!.toInt()
    for(i in 0..n){
        if(i%2==1){
            print("$i ")
        }
    }
}


// 5.Print tables of 2 like below
fun main(){
    var num:Int=readLine()!!.toInt()
    var table:Int=0
    for(i in 1..10){
        table=num*i
        println("${num} * $i = ${table}")
    }
}

// 6.Find sum of all numbers between 0 to N
fun main(){
    var n = readLine()!!.toInt()
    var total:Int=0
    for(i in 1..n){
        total=total+i
    }
    println(total)
}

// 7.Find sum of all even numbers between 0 to N
fun main() {
    var n:Int = readLine()!!.toInt()
    var total:Int=0
    for(i in 0..n){
        if(i%2==0){
            total+=i
        }
    }
    println(total)
}

// 8.Find sum of all odd numbers between 0 to N
fun main() {
    var n:Int = readLine()!!.toInt()
    var total:Int=0
    for(i in 0..n){
        if(i%2==1){
            total+=i
        }
    }
    println(total)
}

// 9.Fizz Buzz Problem
fun main(){
    var num:Int=readLine()!!.toInt()
    for(i in 1..num){
        if(i%3==0&&i%5==0){
            println("Fizzbuzz")
        }
        else if(i%3==0){
            println("Fizz")
        }
        else if(i%5==0){
            println("Buzz")
        }
        else{
            println(i)
        }
    }
}

// 10.Find the factorial of N
fun main(){
    var n:Int=readLine()!!.toInt()
    var total:Int=1
    for(i in n downTo 1){
        total *=i
    }
    println(total)
}


// 11.Find whether the number is prime number or not
fun main(args: Array<String>) {
    val num:Int=readLine()!!.toInt()
    var flag = false
    for (i in 2..num / 2) {
        if (num % i == 0) {
            flag = true
            break
        }
    }
    if (!flag)
        println("$num is a prime number.")
    else
        println("$num is not a prime number.")
}