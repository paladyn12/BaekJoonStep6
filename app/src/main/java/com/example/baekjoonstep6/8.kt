package com.example.baekjoonstep6

import java.util.*

fun main(Args:Array<String>) = with(Scanner(System.`in`)){
    var str = next()
    var sum = 0
    for(i in 0..str.length-1){
        when(str.get(i)){
            'A','B','C' -> sum+= 3
            'D','E','F' -> sum+= 4
            'G','H','I' -> sum+= 5
            'J','K','L' -> sum+= 6
            'M','N','O' -> sum+= 7
            'P','Q','S','S' -> sum+= 8
            'T','U','V' -> sum+= 9
            'W','X','Y','Z' -> sum+= 10
            else -> sum+= 11
        }
    }
    print(sum)
}
// Buffer 사용하여 메모리 단축