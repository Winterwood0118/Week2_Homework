package com.example.week2_homework

import kotlin.math.round

class MultiplyOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Int {
        val answer = num1 * num2
        println("\n$num1 * $num2 = ${answer}입니다.\n")
        return answer
    }

    override fun operate(num1: Double, num2: Double): Double {
        val answer = round((num1 * num2) * 100.0) / 100.0
        println("\n$num1 * $num2 = ${answer}입니다.\n")
        return answer
    }
}