package com.example.week2_homework
// operator는 main에서 받아와서 사용
class Calculator(_operator: String){
    //변수 선언
    var operator = _operator
    var num1 = 0
    var num2 = 0
    //operator에 따라 사용할 함수 작성
    fun addFun(){
        println("\nnum1 + num2 = ${num1 + num2}입니다.\n")
    }
    fun subtractFun(){
        println("\nnum1 - num2 = ${num1 - num2}입니다.\n")
    }
    fun multiplyFun(){
        println("\nnum1 * num2 = ${num1 * num2}입니다.\n")
    }
    fun divideFun(){
        println("\nnum1 / num2 = ${num1 / num2}입니다.\n")
    }
    fun moduloFun(){
        println("\nnum1 % num2 = ${num1 % num2}입니다.\n")
    }
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
        //Calculator 인스턴스를 생성해 클래스 내부의 init실행
        when(operator){
            "+" -> addFun()
            "-" -> subtractFun()
            "*" -> multiplyFun()
            "/" -> divideFun()
            "%" -> moduloFun()
        }
    }
}
