package com.example.week2_homework

class DivideOperation : Calculator() {
    override fun result(num1: Int, num2: Int) {
        if(num2 == 0){
            println("0으로는 나눌 수 없습니다.")
        }else{
            println("\n$num1 / $num2 = ${num1 / num2}입니다.\n")
        }
    }
}