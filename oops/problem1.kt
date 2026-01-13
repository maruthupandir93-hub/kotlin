package com.example.kotlin.oops

/* Problem:
Create a class Student:
    Variables: name, marksArray
    Function calculateAverage()
    Function getResult()
Rules:
    Use loop to calculate average
    If average ≥ 40 → Pass
    Else → Fail  */

class Student{

    fun CalculateAverage(arr:Array<Int>):Int{
        var marks = arr
        var totalmarks=0
        var avgmarks=0
        for(i in 0..(marks.count()-1)){
            totalmarks+=marks[i]
        }
        avgmarks=totalmarks/(marks.count())
        return avgmarks
    }

    fun getresult(mark:Int):String{
        if(mark>=40){
            return "Pass"
        }
        else{
            return "Fail"
        }
    }
}

fun main() {
    var arr = arrayOf(20,20,20,20)
    var ob = Student()
    var avg = ob.CalculateAverage(arr)
    println(ob.getresult(avg))
}