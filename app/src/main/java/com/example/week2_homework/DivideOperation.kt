package com.example.week2_homework

class DivideOperation: Calculator() {
    init {
        //나누기 0에 대한 예외처리
        if(num2 == 0){
            println("\n0으로는 나눌 수 없습니다.\n")
        }
        else{
            println("\nnum1 / num2 = ${num1 / num2}입니다.\n")
        }
    }
}