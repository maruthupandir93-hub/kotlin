package com.example.kotlin.oops


/*
Problem:
    Create:
        Parent class Shape
        Function calculateArea()
    Child classes:
           Rectangle
           Circle
Rules:
        Use if condition inside area calculation
        Print area for each shape
 */

abstract class shape{
    abstract fun CalculateArea()
}
class Rectangle(var l:Int,var b:Int):shape(){
    override fun CalculateArea(){
        var recarea = 0
        recarea = l*b
        println("The area of rectangle is ${recarea}")
    }
}
class Circle(var r:Int):shape(){
    override fun CalculateArea(){
        var cirarea:Double
        cirarea = (3.14*r*r)
        println("The area of circle is ${cirarea}")
    }
}
fun main(){
    var rectangle = Rectangle(10,20)
    var circle = Circle(5)
    rectangle.CalculateArea()
    circle.CalculateArea()
}