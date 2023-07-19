package com.example.layout

//Lv2 : Lv1에서 만든 Calculator 클래스에 나머지 연산을 가능하도록 코드를 추가하고, 연산 진행 후 출력하기
fun main() {

    println("값을 하나씩 입력해 주세요")
    val a = readLine()!!.toInt()
    val operator = readLine()!!.toString()
    val b = readLine()!!.toInt()

    Calculator2(a, operator, b).operator()

}

class Calculator2(val num1: Int, val operator1: String, val num2: Int) {

    fun operator() {

        when (operator1) {
            "+" -> {
                println("$num1 + $num2 = ${num1 + num2} 입니다.")
            }

            "-" -> {
                println("$num1 - $num2 = ${num1 - num2} 입니다.")
            }

            "*" -> {
                println("$num1 * $num2 = ${num1 * num2} 입니다.")
            }

            "/" -> {
                println("$num1 / $num2 의 몫은 ${num1 / num2} 입니다.")
            }

            "%" -> {
                println("$num1 / $num2 의 나머지는 ${num1 % num2} 입니다.")
            }

            else -> {
                println("수식이 잘못 입력 되었습니다")
            }

        }

    }

}