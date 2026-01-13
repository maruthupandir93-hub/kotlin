package com.example.kotlin.oops

/* Problem:
Create class BankAccount:
    private balance
    Functions:
        deposit(amount)
        withdraw(amount)
        getBalance()
Rules:
        Withdraw only if enough balance
        Use loop to perform multiple operations  */

class BankAccount{
    private var balance:Int=1000

    fun deposit(amount:Int):String{
        if(amount>0){
            balance+=amount
            return "The amount is added to your balance"
        }
        else{
            return "Enter the correct amount"
        }
    }
    fun withdraw(amount:Int):String{
        if(amount>0){
            if(balance>0){
                balance-=amount
                return "withdraw success"
            }
            else{
                return "You doesn't have enough balance"
            }
        }else{
            return "Enter correct amount"
        }
    }
    fun getbalance():Int{
        return balance
    }
}
fun main(){
    var ob = BankAccount()

    println(ob.deposit(100))
    println(ob.withdraw(0))
    println(ob.getbalance())

}