package com.example.kotlin.input

/* 1.Write a program to find Area and circumference of square and formula below
        Area = a ^2
        Circumference = 4 * a
        Enter side of square: 5
        Area of Square = 25
        Circumference of Square = 20 */
    fun main() {
        println("Enter side of squares: ")
        var sides:Int=readLine()!!.toInt()
        var area = (Math.pow(sides.toDouble(),2.toDouble()).toInt())
        var circumference = (4*sides)
        println("Area of squares: $area")
        println("circumference of square: $circumference")
    }
/* 2.Write a program to find Area and circumference of Rectangle and formula below
Area = Length * Width
Circumference = 2 * ( Length + Width ) */
        fun main() {
            var l:Int=readLine()!!.toInt()
            var b:Int=readLine()!!.toInt()
            var Area = l*b
            var Circumference =(2*(l+b))
            println("area is $Area")
            println("circumference is $Circumference")
        }
/* 3.Write a program to find Area and circumference of Circle
  Area = Pi * R ^ 2,  Circumference = 2 * PI * R, PI = 3.14, R = Radius */
        fun main() {
            var radius:Int = readLine()!!.toInt()
            val pi = 3.14
            var area = (pi*radius*radius)
            var circumference = (2*pi*radius)
            println("Area: $area")
            println("Circumference: $circumference")
        }
/* 4.Write a program to find the total and average mark of a student. List of Subjects - Tamil, english and math */
        fun main() {
            println("enter tamil mark: ")
            var tamil:Int= readLine()!!.toInt()
            println("enter english mark: ")
            var english:Int = readLine()!!.toInt()
            println("enter math mark: ")
            var math:Int= readLine()!!.toInt()
            var total = tamil + english + math
            var average = total / 3
            println("Total Marks: $total")
            println("Average Mark: $average")
        }
/* 5.Write a program to find the total chicken price. Input will be how many kilos of chicken, Output will be total chicken price. 1KG = 180 Rs */
        fun main() {
            var kilos:Int= readLine()!!.toInt()
            var pricePerKg = 180
            var totalCose = (kilos*pricePerKg)
            println("Kilos: $kilos kg")
            println("Total Price: Rs $totalCose")
        }
/*  6.Write a program to find the discount price. Input will be Total purchase amount, Output will print how much discount and final amount to pay. Discount = 20% */
        fun main() {
            var purchaseAmount:Int = readLine()!!.toInt()
            var discountPercent = 20
            var discountAmount = ((discountPercent/100)*purchaseAmount)
            var finalAmount = purchaseAmount - discountAmount
            println("Discount (20%): Rs $discountAmount")
            println("Final Amount to Pay: Rs $finalAmount")
        }
/* 7.Write a program to find Simple Interest.
Simple Interest = P * N * R / 100, P = Principle, N = Number of years, R = Rate of interest per annum */
        fun main() {
            var p = 10000
            var n = 2
            var r = 5
            var simpleInterest = ((p*n*r)/100)

            println("Principal: $p")
            println("Interest Earned: $simpleInterest")
        }
/* 8.Write a program to find BMI
BMI = Weight / Height^2, Weight in Kg, Height in meter */
        fun main() {
            val weightKg = 70
            val heightMeters = 1.75
            val bmi = weightKg/(heightMeters*heightMeters)
            println("Weight: $weightKg kg")
            println("Height: $heightMeters m")
            println("Your BMI is: ${bmi}")
        }