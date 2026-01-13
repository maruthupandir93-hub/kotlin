package com.example.kotlin.weekproblem


// 1.Palindrome or not
    fun main() {
        var str:String=readLine()!!
        var revstr = str.reversed()
        if(str==revstr){
            println("palindrome")
        }
        else{
            println("not palindrome")
        }
    }

// 2.Count Digits
    fun main(){
        var num:Int=readLine()!!.toInt()
        var n=num
        var count=0
        while(n!=0){
            var rem=n%10
            count++
            n=n/10
        }
        println(count)
    }

// 3.Reverse the number
        fun main(){
            var num:Int=readLine()!!.toInt()
            var n= num
            var result=0
            while(n!=0){
                var rem = n%10
                result=(result*10)+rem
                n=n/10
            }
            println(result)
        }

// 4.Armstrong number or not
        fun main(){
            var num:Int=readLine()!!.toInt()
            var n=num

            var count=0
            while(n!=0){
                var rem=n%10
                count++
                n=n/10
            }
            var result =  amstrongnumber(count,num)
            if(result==num){
                println("It is amstrong number")
            }
            else{
                println("It is not amstrong number")
            }
        }
        fun amstrongnumber(count:Int,num:Int):Int{
            var powered=0
            var m=num
            while(m!=0){
                var powerrem=m%10
                powered=powered+(Math.pow(powerrem.toDouble(),count.toDouble())).toInt()
                m=m/10
            }
            return powered
        }


// 5.Find Divisors of Number
        fun main(){
            var num:Int=readLine()!!.toInt()
            for(i in 1..(num/2)){
                if(num%i==0){
                    print("$i, ")
                }

            }
            print(num)
        }

// 6.Prime number or not
        fun main(){
            var num:Int=readLine()!!.toInt()
            var isprime=false
            for(i in 2..(num/2)){
                if(num%i==0){
                    isprime= true
                    break
                }
            }
            if(!isprime){
                println("it is prime")
            }
            else{
                println("not a prime")
            }
        }

// 7.Factorial of the number
fun main(){
    var num:Int=readLine()!!.toInt()
    var total=1
    for(i in num downTo 1){
        total = total*i
    }
    println("Factorial of 5 is ${total}")
}