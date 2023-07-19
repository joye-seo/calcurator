package com.example.layout

//Lv1 : 더하기, 빼기, 나누기, 곱하기 연산을 수행할 수 있는 Calculator 클래스를 만들고, 클래스를 이용하여 연산을 진행하고 출력하기
fun main() {

    println("값을 하나씩 입력해 주세요")
    val a = readLine()!!.toInt()
    val operator = readLine()!!.toString()
    val b = readLine()!!.toInt()

    Calculator(a, operator, b).operator()

}

class Calculator(val num1: Int, val operator1: String, val num2: Int) {

    fun operator() {

        when (operator1) {
            "+" -> {
                println("결과값은 ${num1 + num2} 입니다.")
            }

            "-" -> {
                println("결과값은 ${num1 - num2} 입니다.")
            }

            "*" -> {
                println("결과값은 ${num1 * num2} 입니다.")
            }

            "/" -> {
                println("결과값은 ${num1 / num2} 입니다.")
            }

            else -> {
                println("수식이 잘못 입력 되었습니다")
            }
        }

    }


}