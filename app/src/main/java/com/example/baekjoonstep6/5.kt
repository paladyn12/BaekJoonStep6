package com.example.baekjoonstep6

import java.util.*

fun main(Args:Array<String>) = with(Scanner(System.`in`)){
    var countArray = Array(26,{0})
    var str = next()
    for(i in 0..str.length-1){
        if(str.get(i).toInt() >= 97)
            countArray[str.get(i).toInt()-97]++
        else
            countArray[str.get(i).toInt()-65]++
    }
    var max = -1
    var maxIndex = 0
    var multiMax = 0
    for(i in 0..25){
        if(countArray[i]>max){
            max = countArray[i]
            maxIndex = i
        }
    }
    for(i in 0..25){
        if(countArray[i] == max)
            multiMax++
    }
    if(multiMax >= 2) print('?')
    else print((maxIndex+65).toChar())
}