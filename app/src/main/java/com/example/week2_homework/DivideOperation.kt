package com.example.week2_homework

import kotlin.math.round

class DivideOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Int {
        var answer = 0
        if (num2 == 0) {
            println("0으로는 나눌 수 없습니다.")
        } else {
            answer = num1 / num2
            println("\n$num1 / $num2 = ${answer}이며 나머지는 ${num1 % num2}입니다.\n")
        }
        return answer
    }

    override fun operate(num1: Double, num2: Double): Double {
        var answer = 0.0
        if (num2 == 0.0) {
            println("0으로는 나눌 수 없습니다.")
        } else {
            answer = round((num1 / num2) * 100.0) / 100.0
            println("\n$num1 / $num2 = ${answer}입니다.\n")
        }
        return answer
    }
}