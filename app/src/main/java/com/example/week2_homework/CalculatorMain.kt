package com.example.week2_homework

fun main(){
    println("이 프로그램은 두 정수 사이에서 간단한 사칙연산을 실행하는 계산기입니다.")
    var operator: String = ""
    while (true) {
        println("아래 보기 중 사용할 번호를 입력하세요.")
        println("1. 더하기")
        println("2. 빼기")
        println("3. 곱하기")
        println("4. 나누기")
        val input3 = readln()
        when(input3){
            "+", "-", "*", "/" -> {
                operator = input3
                break
            }
            "1" -> {
                operator = "+"
                break
            }
            "2" -> {
                operator = "-"
                break
            }
            "3" -> {
                operator = "*"
                break
            }
            "4" -> {
                operator = "/"
                break
            }
            else -> {
                println("잘못된 입력입니다.")
            }
        }
    }
    //Calculator 인스턴스를 생성해 클래스 내부의 init실행
    val calc = Calculator()

    when(operator){
        "+" -> calc.addFun()
        "-" -> calc.subtractFun()
        "*" -> calc.multiplyFun()
        "/" -> calc.divideFun()
    }

}