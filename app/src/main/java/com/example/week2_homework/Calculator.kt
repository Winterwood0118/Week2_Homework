package com.example.week2_homework
// operator는 main에서 받아와서 사용
class Calculator() {
    var num1 = 0
    var num2 = 0
    // 인스턴스 생성과 동시에 num1, num2 입력
    init {
        //숫자를 입력할 때까지 반복
        while (true) {
            println("첫번째 수를 입력하세요.")
            val input1 = readln()

            if(input1.all{ it.isDigit() }){
                num1 = input1.toInt()
                break
            }else{
                println("잘못된 입력입니다.")
            }
        }
        //숫자를 입력할 때까지 반복
        while (true) {
            println("두번째 수를 입력하세요.")
            val input2 = readln()

            if(input2.all{ it.isDigit() }){
                num2 = input2.toInt()
                break
            }else{
                println("잘못된 입력입니다.")
            }
        }

    }
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
}