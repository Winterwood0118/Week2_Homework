package com.example.week2_homework
// 부모 Class로 사용하기위해 open, 함수 제거
// 어떤 연산이든 수를 입력받는 공통부분을 부모클래스에 남김
open class Calculator(){
    //변수 선언
    var num1 = 0
    var num2 = 0
    var answer = 0
    init {
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
    }
    open fun makeAnswer(): Int{
        return answer
    }
    fun addFun(){
        println("\nnum1 + num2 = ${makeAnswer()}입니다.\n")
    }
    fun substractFun(){
        println("\nnum1 + num2 = ${makeAnswer()}입니다.\n")
    }
    fun multiplyFun(){
        println("\nnum1 * num2 = ${makeAnswer()}입니다.\n")
    }
    fun divideFun(){
        //나누기 0에 대한 예외처리
        if(num2 == 0){
            println("\n0으로는 나눌 수 없습니다.\n")
        }
        else{
            println("\nnum1 / num2 = ${makeAnswer()}입니다.\n")
        }
    }
}
