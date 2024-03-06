package com.example.week2_homework
// operator는 main에서 받아와서 사용
class Calculator() {
    var operator: String = ""
    var num1 = 0
    var num2 = 0

    //operator에 따라 사용할 함수 작성
    fun addFun(){
        val answer = num1 + num2
        println("num1 + num2 = ${answer}입니다.")
    }
    fun subtractFun(){
        val answer = num1 - num2
        println("num1 - num2 = ${answer}입니다.")
    }
    fun multiplyFun(){
        val answer = num1 * num2
        println("num1 * num2 = ${answer}입니다.")
    }
    fun divideFun(){
        val answer = num1 / num2
        println("num1 / num2 = ${answer}입니다.")
    }

    // 인스턴스 생성과 동시에 계산기 가동
    init {
        while (true) {
            println("아래 보기 중 사용할 번호를 입력하세요.")
            println("1. 더하기 \t 2. 빼기 \t 3. 곱하기 \t 4. 나누기")
            val input1 = readln()
            when(input1){
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
                    println("올바른 번호를 입력하세요.")
                }
            }
        }
        //숫자를 입력할 때까지 반복
        while (true) {
            println("첫번째 수를 입력하세요.")
            val input2 = readln()

            if(input2.all{ it.isDigit() }){
                num1 = input2.toInt()
                break
            }else{
                println("잘못된 입력입니다.")
            }
        }
        //숫자를 입력할 때까지 반복
        while (true) {
            println("두번째 수를 입력하세요.")
            val input3 = readln()

            if(input3.all{ it.isDigit() }){
                num2 = input3.toInt()
                break
            }else{
                println("잘못된 입력입니다.")
            }
        }
        when(operator){
            "+" -> addFun()
            "-" -> subtractFun()
            "*" -> multiplyFun()
            "/" -> divideFun()
        }
    }
}