package com.example.week2_homework

class MultiplyOperation : Calculator() {

    override fun result(num1: Int, num2: Int) {
            println("\n$num1 * $num2 = ${num1 * num2}입니다.\n")
    }

}