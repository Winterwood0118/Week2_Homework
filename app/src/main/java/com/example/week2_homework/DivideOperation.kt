package com.example.week2_homework

class DivideOperation: Calculator() {
    init {
        if(num2 == 0){
            println("\n0으로는 나눌 수 없습니다.\n")
        }
        else{
            println("\nnum1 / num2 = ${num1 / num2}입니다.\n")
        }
    }
}