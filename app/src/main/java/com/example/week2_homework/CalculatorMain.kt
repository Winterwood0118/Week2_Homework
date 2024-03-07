package com.example.week2_homework

// 1. 종료까지 무한루프 기능 추가
// 2. 사용할 연산자, 숫자 받아오기
// 2-2 연산자 따라서 다른 오퍼레이션 불러오기
// 3. 예외처리
fun main() {
    println("이 프로그램은 두 수 사이에서 간단한 사칙연산을 실행하는 계산기입니다.")
    var calc: Calculator
    var num1: Number
    var num2: Number
    while (true) {
        println("아래 보기 중 사용할 기능의 번호를 입력하세요.")
        println("-1. 종료하기 \t 1. 더하기 \t 2. 빼기 \t 3. 곱하기 \t 4. 나누기")
        val input1 = readln()
        when (input1) {
            "-1" -> {
                println("종료합니다.")
                break
            }
            "1" -> {
                println("더하기를 선택하셨습니다.\n")
                calc = Calculator(AddOperation())
            }

            "2" -> {
                println("빼기를 선택하셨습니다.\n")
                calc = Calculator(SubstractOperation())
            }

            "3" -> {
                calc = Calculator(MultiplyOperation())
                println("곱하기를 선택하셨습니다.\n")
            }

            "4" -> {
                println("나누기를 선택하셨습니다.\n")
                calc = Calculator(DivideOperation())
            }

            else -> {
                println("올바른 번호를 입력해주세요.\n")
                continue
            }
        }
        println("첫번째 숫자를 입력하세요.")
        while (true) {
            val input2 = readln()
            if (input2.all { it.isDigit() }) {
                num1 = input2.toInt()
                break
            } else if (input2.all { it.isDigit() or (it == '.') }) {
                num1 = input2.toDouble()
                break
            } else {
                println("정수, 실수만 입력하세요.")
            }
        }

        println("두번째 숫자를 입력하세요.")
        while (true) {
            val input2 = readln()
            if (input2.all { it.isDigit() }) {
                num2 = input2.toInt()
                break
            } else if (input2.all { it.isDigit() or (it == '.') }) {
                num2 = input2.toDouble()
                break
            } else {
                println("정수만 입력하세요.")
            }
        }
        if (num1 is Int && num2 is Int) {
            calc.result(num1.toInt(), num2.toInt())
        } else {
            calc.result(num1.toDouble(), num2.toDouble())
        }
    }

}