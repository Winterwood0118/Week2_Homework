package com.example.week2_homework

// 출력함수
class Calculator(val operate: Operate) {
    fun result(num1: Int, num2: Int) {
        operate.operate(num1, num2)
    }
}
