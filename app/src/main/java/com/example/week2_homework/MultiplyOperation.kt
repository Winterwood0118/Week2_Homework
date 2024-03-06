package com.example.week2_homework

class MultiplyOperation: Calculator() {
    override fun makeAnswer(): Int{
        answer = num1 * num2
        return answer
    }
    init {
        multiplyFun()
    }
}