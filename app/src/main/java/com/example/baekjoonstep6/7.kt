package com.example.baekjoonstep6

import java.util.*

fun main(Args:Array<String>) = with(Scanner(System.`in`)){
    var num1 = nextInt()
    var num2 = nextInt()
    var newNum1 = (num1%10)*100 + ((num1%100)/10)*10 + num1/100
    var newNum2 = (num2%10)*100 + ((num2%100)/10)*10 + num2/100
    if(newNum1>newNum2) println(newNum1)
    else println(newNum2)
}