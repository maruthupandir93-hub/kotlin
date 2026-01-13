package com.example.kotlin.weekproblem

// 15. Write a program to count the number of vowels and consonants in a given string.
// Input: "Coding" Output: Vowels: 2 Consonants: 4

        fun main() {
            var name:String="12345"
            var str=name.lowercase().replace(" ","")
            var vowels=0
            var consonant=0
            for(i in 0..(str.length-1)){
                if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'){
                    vowels++
                }
                else if(str[i] in 'a'..'z'){
                    consonant++
                }
                else{

                }
            }
            println("vowels: ${vowels}")
            println("consonant: ${consonant}")
        }

// 16. Write a program to split a given sentence into individual words. Remove any leading or trailing whitespace from each word.
// Input "Coding is fun." Output ["Coding", "is", "fun."]

        fun main(){
            var name:String="   coding    is    fun.   !!!  "

            var result = splitsentance(name)
            println(result)
        }
        fun splitsentance(name:String):ArrayList<Any>{
            var str=name
            var words = ArrayList<Any>()
            var current:String=""
            for(i in 0..(str.length-1)){
                if(str[i]==' '){
                    if(current.length>0){
                        words.add(current)
                        current=""
                    }
                }
                else{
                    current=current+str[i]
                }
            }
            if(current.length>0){
                words.add(current)
            }
            return words
        }

// 17.Write a program to remove spaces from a given string.
// Input "        Programming         is        fun          !!      " Output "Programming is fun !!"
        fun main(){
            var ip:String="192.168.0.1"
            var current
            for(i in 0..(ip.length-1)){
                if(ip[i]=='.'){

                }
                else{

                }
            }
        }

// 18. Write a program to validate whether a given string represents a valid IPv4 address.
        fun main(){
            var str:String="266.0.0.0"

            var result = validip(str)

            if(result==true){
                println("valid ip")
            }
            else{
                println("invalid ip")
            }
        }
        fun validip(str:String):Boolean{
            var parts = str.split(".")
            if(parts.size!=4){
                return false
            }

            for(part in parts){
                if(part.isEmpty()||!part.all{it.isDigit()}){
                    return false
                }
                val number:Int? = part.toIntOrNull()
                if(number==null){
                    return false
                }
                if(number<0 ||number>255){
                    return false
                }
            }
            return true
        }

// 19.String Compression
// Input "aaabbcccc" - 10 Output "a3b2c4" - 6
         fun main(){
            var input:String="abc"
            var result = compression(input)
            println(result)
        }
        fun compression(input:String):String{
            var str = input
            var output = ""
            output += str[0]
            var count=1
            for(i in 1..(str.length-1)){
                if(str[i]==str[i-1]){
                    count=count+1

                }
                else{
                    if(count>1){
                        output+=count
                    }
                    output+=str[i]
                    count=1
                }
            }
            if(count>1){
                output+=count
            }
            return output
        }

// 20.Anagram

        fun main(){
            var s1:String=readLine()!!
            var s2:String=readLine()!!
            if(s1.length!=s2.length){
                println("not Anagram")
            }

            var s1sorted= s1.lowercase().toCharArray().sorted()
            var s2sorted= s2.lowercase().toCharArray().sorted()

            if(s1sorted==s2sorted){
                println("Anagram")
            }
            else{
                println("not Anagram")
            }
        }

// 21.Word Search
        fun main(){
            var s="abcadcat"
            var t="cat"
            var index = search(s,t)
            if(index==-1){
                println("not found")
            }
            else{
                println("found at ${index}")
            }
        }
        fun search(s:String,t:String):Int{

            for(i in 0..(s.length-1)){
                if(s[i]==t[0]){
                    var j =i
                    var k =0
                    while(s[j]==t[k]&&j<(s.length)&& k<(t.length)){
                        j+=1
                        k+=1
                    }
                    if(k==(t.length)){
                        return i
                    }
                }

            }
            return -1
        }