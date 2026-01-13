package com.example.kotlin.weekproblem

// 8 - Sum of Elements in the Array
fun main() {
    var arr=arrayOf(12,5,8,23,17,9)
    var sum=0
    for(i in 0..(arr.size-1)){
        sum+=arr[i]
    }
    println(sum)
}


// 9 - Large Element in the array
fun main(){
    var arr=arrayOf(12,5,8,23,17,9)
    var temp=arr[0]
    for(i in 0..(arr.size-1)){
        if(arr[i]>temp){
            temp=arr[i]
        }
    }
    println("Largest Element = ${temp}")
}

// 10 - Small Element in the array
fun main(){
    var arr=arrayOf(12,5,8,23,17,9)
    var temp=arr[0]
    for(i in 0..(arr.size-1)){
        if(arr[i]<temp){
            temp=arr[i]
        }
    }
    println("Smallest Element = ${temp}")
}

// 11 - Search element in the array
fun main(){
    var arr=arrayOf(12,5,8,23,17,9)
    var target=9
    var result = searchelement(arr,target)
    println(result)
}

fun searchelement(arr:Array<Int>,target:Int):String{

    for(i in 0..(arr.size-1)){
        if(target==arr[i]){
            return "Element found at index $i"
        }
    }
    return "Element not found"
}


// 12 - Count element in the array
fun main(){
    var arr=arrayOf(12,5,8,23,17,9)
    var odd=0
    var even=0
    for(i in 0..(arr.size-1)){
        if(arr[i]%2==0){
            even++
        }
        else{
            odd++
        }
    }
    println("Odd numbers Count = ${odd}")
    println("Even numbers count = ${even}")
}

// 13 - Reverse the array
fun main(){
    var arr=arrayOf(12,5,8,23,17,9)
    var revarr = ArrayList<Any>()
    for(i in (arr.size-1) downTo 0){
        revarr.add(arr[i])
    }
    print(revarr)
}

// 14 - Filter Elements from Array
fun main(){
    var arr=arrayOf(-12,5,8,-23,-17,9)
    var revarray = ArrayList<Any>()
    for(i in 0..(arr.size-1)){
        if(arr[i]>=0){
            revarray.add(arr[i])
        }
    }
    print(revarray)
}