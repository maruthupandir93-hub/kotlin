package com.example.kotlin.input

/* 1.Write program to get name from user and print in the output
        Enter your name: Vignesh
        Your name is Vignesh
 */
        fun main(args:Array<String>) {
            println("Enter your name: ")
            var name:String=readLine()!!
            println("your name is $name")
        }
/* 2.Write program to get name and father name from user and print in the output
        Enter your name : Vignesh
        Enter your father name: Ganesan
        Hello Vignesh Ganesan */
            fun main(args:Array<String>) {
                    println("Enter your name: ")
                    var name:String=readLine()!!
                    println("Enter your father name: ")
                    var father:String=readLine()!!
                    println("Hello $name $father")
            }
/* 3. Write program to get name from user and print in the output
        Enter your name: Vignesh
        Your name is Vignesh */
            fun main(args:Array<String>) {
                println("Enter your name: ")
                var name:String=readLine()!!
                println("Enter your address: ")
                var address:String=readLine()!!
                println("Hello $name, you are in $address")
            }
