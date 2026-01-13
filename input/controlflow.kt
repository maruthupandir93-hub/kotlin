package com.example.kotlin.input

// 1. Write a program to find whether person is eligible to vote or not.
fun main() {
    var age:Int=readLine()!!.toInt()
    if(age>=18){
        println("eligible to vote")
    }else{
        println("Not eligible to")
    }
}

// 2. Write a program to find a number whether it is Positive or negative
fun main(){
    var input=readLine()!!.toInt()
    if(input>0){
        println("positive number")
    }
    else if(input<0){
        println("Negative number")
    }
    else{
        println("Neither positive or negative")
    }
}

// 3. Write a program to find whether the number is divisible by 5
fun main(){
    var num=readLine()!!.toInt()
    if(num%5==0){
        println("Divisible")
    }
    else{
        println("Not divisible")
    }
}
// 4. Write a program to find a number whether it is odd or even. Zero is neither odd or even
fun main(){
    var num =readLine()!!.toInt()
    if(num==0){
        println("Zero is neither odd or even")
    }
    else if(num%2==0){
        println("even number")
    }
    else{
        println("odd number")
    }
}

// 5. Find Student result based on total marks
fun main(){
    var marks:Int=readLine()!!.toInt()
    if(marks>=35){
        println("Pass")
    }
    else{
        println("Fail")
    }
}

// 6. Print Day Names for the given number
fun main(){
    var number:Int=readLine()!!.toInt()
    var result = when(number){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "invalid"
    }
    println(result)
}

// 7. Give Grades for student based on below condition
fun main(){
    var marks:Int=readLine()!!.toInt()
    if(marks==100){
        println("grade A")
    }
    else if(marks>=90&&marks<=99){
        println("grade B")
    }
    else if(marks>=70&&marks<=89){
        println("grade C")
    }
    else if(marks>=35&&marks<=69){
        println("grade D")
    }
    else if(marks>=0&&marks<=34){
        println("Fail")
    }
    else{
        println("invalid")
    }
}

// 8. Write a program to calculate profit or loss
fun main(){
    var buy:Int=readLine()!!.toInt()
    var sell:Int=readLine()!!.toInt()
    if(buy>sell){
        println("loss")
    }
    else if(sell>buy){
        println("profit")
    }
    else{
        println("no profit no loss")
    }
}

// 9. Fizz Buzz FizzBuzz
fun main(){
    var num=readLine()!!.toInt()
    if(num%3==0&&num%5==0){
        println("FizzBuzz")
    }
    else if(num%5==0){
        println("Buzz")
    }
    else if(num%3==0){
        println("Fizz")
    }
    else{
        println("invalid")
    }
}

// 10. Leap Year or Not
fun main(){
    var year:Int=readLine()!!.toInt()

    if(year%100==0){
        if(year%400==0){
            println("leap year")
        }
        else{
            println("not a leap year")
        }
    }
    else if(year%4==0){
        println("leap year")
    }else{
        println("not a leap year")
    }
}
