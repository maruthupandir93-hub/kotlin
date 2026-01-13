package com.example.kotlin.input

/* 1.   *    *    *    *    *
        *    *    *    *    *
        *    *    *    *    *
        *    *    *    *    *
        *    *    *    *    *   */
        fun main(){
            var n:Int=readLine()!!.toInt()
            for(i in 0..(n-1)){
                for(j in 0..(n-1)){
                    print("* ")
                }
                println()
            }
        }

/* 2.   3    3    3
        3    3    3
        3    3    3  */
        fun main(){
            var n:Int=readLine()!!.toInt()
            for(i in 1..n){
                for(j in 1..n){
                    print("$n ")
                }
                println()
            }
        }

/* 3.   1    1    1    1    1
        2    2    2    2    2
        3    3    3    3    3
        4    4    4    4    4
        5    5    5    5    5  */
        fun main(){
            var n:Int=readLine()!!.toInt()
            for(i in 1..n){
                for(j in 1..n){
                    print("$i ")
                }
                println()
            }
        }

/* 4.   1    2    3    4    5
        1    2    3    4    5
        1    2    3    4    5
        1    2    3    4    5
        1    2    3    4    5 */
        fun main(){
            var n:Int=readLine()!!.toInt()
            for(i in 1..n){
                for(j in 1..n){
                    print("$j ")
                }
                println()
            }
        }

/* 5.   *
        *    *
        *    *    *
        *    *    *    *
        *    *    *    *    *          */

        fun main(){
            var n:Int=readLine()!!.toInt()
            for(i in n downTo 1){
                for(j in 1..(n+1-i)){
                    print("* ")
                }
                for(k in (n-i) downTo 1){
                    print(" ")
                }
                println()
            }
        }

/* 6.   *    *    *    *    *
        *    *    *    *
        *    *    *
        *    *
        *                    */
        fun main(){
            var n:Int=readLine()!!.toInt()
            for(i in 1..n){
                for(j in (n+1-i) downTo 1){
                    print("* ")
                }
                for(k in 1 until i){
                    print(" ")
                }
                println()
            }
        }

/* 7.   1
        1    2
        1    2    3
        1    2    3    4
        1    2    3    4    5     */
        fun main(){
            var n:Int=readLine()!!.toInt()
            for(i in 1..n){
                for(j in 1..i){
                    print("$j ")
                }
                for(k in (n-i) downTo 1){
                    print(" ")
                }
                println()
            }
        }

/* 8.   1    2    3    4    5
        1    2    3    4
        1    2    3
        1    2
        1               */
        fun main(){
            var n:Int=readLine()!!.toInt()
            for(i in 1..n){
                for(j in 1..(n+1-i)){
                    print("$j ")
                }
                for(k in 1 until i){
                    print(" ")
                }
                println()
            }
        }

/* 9.   5    4    3    2    1
        5    4    3    2
        5    4    3
        5    4
        5                 */
        fun main(){
            var n :Int=readLine()!!.toInt()
            for(i in 1..n){
                for(j in 5 downTo i){
                    print("$j ")
                }
                for(k in 1 until  i){
                    print(" ")
                }
                println()
            }
        }

/* 10. 1     2     3     4
        5     6     7     8
        9     10    11    12
        13    14    15    16      */
        fun main(){
            var n:Int=readLine()!!.toInt()
            var a:Int=1

            for(i in 1..n){
                for(j in 1..n){
                    print("$a\t")
                    a++
                }
                println()
            }
        }

/* 11.  *    *    *    *    *
        *                   *
        *                   *
        *                   *
        *    *    *    *    *   */
        fun main(){
            var n:Int=readLine()!!.toInt()
            for(i in 1..n){
                for(j in 1..n){
                    if(i==1||i==n||j==1||j==n){
                        print("* ")
                    }
                    else{
                        print("  ")
                    }
                }
                println()
            }
        }

/* 12.  *    *    *    *    *
        *                   *
        *         *         *
        *                   *
        *    *    *    *    *     */
        fun main(){
            var n:Int=readLine()!!.toInt()
            for(i in 1..n){
                for(j in 1..n){
                    if(i==1||i==n||j==1||j==n||(i==3&&j==3)){
                        print("* ")
                    }
                    else{
                        print("  ")
                    }
                }
                println()
            }
        }

/* 13.  *    *    *    *    *
             *    *    *    *
                  *    *    *
                       *    *
                            *     */
        fun main(){
            var n:Int=readLine()!!.toInt()
            for(i in 1..n){
                for(k in 1 until i){
                    print("  ")
                }
                for(j in 1..(n+1-i)){
                    print("* ")
                }

                println()
            }
        }

/* 14.  1    2    3    4    5
             2    3    4    5
                  3    4    5
                       4    5
                            5       */
        fun main(){
            var n:Int=readLine()!!.toInt()
            for(i in 1..n){
                for(k in 1 until i){
                    print("  ")
                }
                for(j in i..5){
                    print("$j ")
                }

                println()
            }
        }

/* 15.  5    4    3    2    1
             4    3    2    1
                  3    2    1
                       2    1
                            1     */
        fun main(){
            var n:Int=readLine()!!.toInt()
            for(i in n downTo 1){
                for(k in 1 until (n-i+1)){
                    print("  ")
                }
                for(j in i downTo 1){
                    print("$j ")
                }

                println()
            }
        }

