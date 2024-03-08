package com.example.week2_homework


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
        num1 = takeNumber()

        println("두번째 숫자를 입력하세요.")
        num2 = takeNumber()

        if (num1 is Int && num2 is Int) {
            calc.result(num1.toInt(), num2.toInt())
        } else {
            calc.result(num1.toDouble(), num2.toDouble())
        }
    }

}

private fun takeNumber(): Number {
    var number: Number
    while (true) {
        val input = readln()
        try {
            if (input.contains('.')) {
                number = input.toDouble()
                break
            } else {
                number = input.toInt()
                break
            }
        } catch (e: Exception) {
            println("올바른 수만 입력하세요.")
        }
    }
    return number
}
