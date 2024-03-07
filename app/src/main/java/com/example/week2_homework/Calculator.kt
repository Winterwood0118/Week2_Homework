package com.example.week2_homework

// 출력함수
class Calculator(val operation: AbstractOperation) {
    fun result(num1: Int, num2: Int) {
        operation.operate(num1, num2)
    }
    fun result(num1: Double, num2: Double) {
        operation.operate(num1, num2)
    }
}
