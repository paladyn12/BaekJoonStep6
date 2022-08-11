package com.example.baekjoonstep6

import java.util.*

fun main(Args:Array<String>) = with(Scanner(System.`in`)){
    var caseNum = nextInt()
    for(i in 1..caseNum){
        var repeatNum = nextInt()
        var str = next()
        for(i in 0..str.length-1)
            for(j in 0..repeatNum-1)
                print(str.get(i))
        println()
    }
}