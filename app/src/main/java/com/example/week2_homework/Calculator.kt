package com.example.week2_homework

class Calculator(num1: Int, num2: Int, operator: String) {

    fun calculator(num1:Int, num2:Int, operator:String) {


    }
}

fun main(){


    while(true) {
        println("아래 연산자 중 사용할 연산자를 입력해주세요.")
        println("1. 더하기: +")
        println("2. 빼기: -")
        println("3. 곱하기: *")
        println("4. 나누기: /")
        var operator = readLine()!!.toString()
        when(operator){
            "+", "-", "*", "/" -> break
            else -> {
                println("잘못된 입력입니다.")
            }
        }
    }

}