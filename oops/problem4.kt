package com.example.kotlin.oops

/* Given an array of integers:

Tasks:
    Find largest number
    Find smallest number
    Count even numbers
 */

fun largestnumber(numbers:Array<Int>):Int{
    var large = numbers[0]

    for(i in 0..(numbers.size-1)){
        if(numbers[i]>large){
            large=numbers[i]
        }

    }
    return large
}
fun smalestnumber(numbers:Array<Int>):Int{
    var small = numbers[0]
    for(j in 0..(numbers.size-1)){
        if(numbers[j]<small){
            small=numbers[j]
        }
    }
    return small
}
fun evennumber(numbers:Array<Int>):Int{
    var count =0
    for(k in 0..(numbers.size-1)){
        if(numbers[k]%2==0){
            count++
        }
    }
    return count
}
fun main(){
    var numbers= arrayOf(3,7,2,9,4)
    println(largestnumber(numbers))
    println(smalestnumber(numbers))
    println(evennumber(numbers))
}