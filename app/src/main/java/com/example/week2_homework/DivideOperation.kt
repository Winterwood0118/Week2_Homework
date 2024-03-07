package com.example.week2_homework

class DivideOperation: Calculator() {
    override fun makeAnswer(): Int{
        answer = num1 / num2
        return answer
    }
    init {
        divideFun()
    }
}