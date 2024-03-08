package com.example.week2_homework

import kotlin.math.round

class SubstractOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Int {
        println("\n$num1 - $num2 = ${num1 - num2}입니다.\n")
        return num1 - num2
    }

    override fun operate(num1: Double, num2: Double): Double {
        println("\n$num1 - $num2 = ${round((num1 - num2) * 100.0) / 100.0}입니다.\n")
        return round((num1 - num2) * 100.0) / 100.0
    }
}