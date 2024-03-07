package com.example.week2_homework

import kotlin.math.round

class DivideOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int) {
        if (num2 == 0) {
            println("0으로는 나눌 수 없습니다.")
        } else {
            println("\n$num1 / $num2 = ${num1 / num2}입니다.\n")
        }
    }

    override fun operate(num1: Double, num2: Double) {
        if (num2 == 0.0) {
            println("0으로는 나눌 수 없습니다.")
        } else {
            println("\n$num1 / $num2 = ${round((num1 / num2) * 100.0) / 100.0}입니다.\n")
        }
    }
}