package com.example.week2_homework

fun main(){
    println("이 프로그램은 두 정수 사이에서 간단한 사칙연산을 실행하는 계산기입니다.\n")
    // 무한루프를 통해 -1을 입력받지 않으면 프로그램을 계속함
    while (true) {
        println("아래 보기 중 사용할 기능의 번호를 입력하세요.")
        println("1. 더하기 \t 2. 빼기 \t 3. 곱하기 \t 4. 나누기")
        println("-1을 입력하면 계산기가 종료됩니다.")
        val input1 = readln()
        when (input1) {
            "1" -> {
                println("더하기를 선택했습니다.")
                val calc = AddOperation()
            }
            "2" -> {
                println("빼기를 선택했습니다.")
                val calc = SubstractOperation()
            }
            "3" -> {
                println("곱하기를 선택했습니다.")
                val calc = MultiplyOperation()
            }
            "4" -> {
                println("나누기를 선택했습니다.")
                val calc = DivideOperation()
            }
            "-1" -> {
                println("계산기를 종료합니다.")
                break
            }
            else -> {
                println("잘못된 입력입니다.")
                continue
            }
        }

    }
}