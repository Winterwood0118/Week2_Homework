package com.example.week2_homework

fun main(){
    println("이 프로그램은 두 수 사이에서 간단한 사칙연산을 실행하는 계산기입니다.")
    var operator = ""
    while (true) {
        println("아래 보기 중 사용할 기능의 번호를 입력하세요.")
        println("1. 더하기 \t 2. 빼기 \t 3. 곱하기 \t 4. 나누기 \t 5. 나머지")
        println("-1을 입력하면 계산기가 종료됩니다.")
        val input1 = readln()
        when (input1) {
            "1" -> {
                println("더하기를 선택했습니다.")
                operator = "+"
            }

            "2" -> {
                println("빼기를 선택했습니다.")
                operator = "-"
            }

            "3" -> {
                println("곱하기를 선택했습니다.")
                operator = "*"
            }

            "4" -> {
                println("나누기를 선택했습니다.")
                operator = "/"
            }

            "5" -> {
                println("나머지를 선택했습니다.")
                operator = "%"
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
        var calc = Calculator(operator)
    }
}