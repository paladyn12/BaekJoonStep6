package com.example.baekjoonstep6

import java.io.*

fun main(){
    var br = BufferedReader(InputStreamReader(System.`in`))
    var str = br.readLine()
    var sum = 0
    for(i in 0..str.length-1){
        when(str[i]){
            'A','B','C' -> sum+= 3
            'D','E','F' -> sum+= 4
            'G','H','I' -> sum+= 5
            'J','K','L' -> sum+= 6
            'M','N','O' -> sum+= 7
            'P','Q','R','S' -> sum+= 8
            'T','U','V' -> sum+= 9
            'W','X','Y','Z' -> sum+= 10
        }
    }
    print(sum)
    br.close()
}
// Buffer 사용하여 메모리 단축