package com.example.baekjoonstep6

import java.util.*

fun main(Args:Array<String>) = with(Scanner(System.`in`)){
    var countArray = Array(26,{-1})
    var S = next()
    // 'a'값 : 97

    for(i in 0..S.length-1){
        if(countArray[S.get(i).toInt()-97] == -1)
            countArray[S.get(i).toInt()-97] = i
    }
    for(i in 0..25) print("${countArray[i]} ")
}