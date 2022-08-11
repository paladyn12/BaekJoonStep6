package com.example.baekjoonstep6

import java.util.*

fun main(Args:Array<String>) = with(Scanner(System.`in`)){
    var n = nextInt()
    var numString = next()
    var sum = 0
    for(i in 0..n-1){
        sum += numString.get(i).toInt()-'0'.toInt()
    }
    print(sum)
}