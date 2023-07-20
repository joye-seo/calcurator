package com.example.layout


//Lv3 : AddOperation(더하기), SubtractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기) 연산 클래스를 만든 후 클래스간의 관계를 고려하여 Calculator 클래스와 관계를 맺기

fun main() {

    println("계산기 ON")
    println("첫번째 숫자를 입력해 주세요")
    val a = readLine()!!.toInt()

    println("수식을 입력해 주세요")
    val operator = readLine()!!.toString()

    println("두번째 숫자를 입력해 주세요")
    val b = readLine()!!.toInt()
    Calculator3(a, operator, b).result()

    println("계산기 OFF")

}

private open class Calculator3(val num1: Int, val operator: String, val num2: Int) {

    fun result() {

        when (operator) {
            "+" -> {

                AddOperation(num1, operator, num2).add()

            }

            "-" -> {

                SubtractOperation(num1, operator, num2).subtract()

            }

            "*" -> {

                MultiplyOperation(num1, operator, num2).multiply()

            }

            "/" -> {

                DivideOperation(num1, operator, num2).divide()

            }

            else -> {

                println("수식이 잘못 입력 되었습니다")

                /**
                 * num1, num2에 숫자 대신 문자를 넣으면 런타임 오류가 생기기 때문에
                 * 수식에 대한 오류 값만 처리해 주면 됨
                 */

            }
        }

    }

}

private class AddOperation(var _num1: Int,  _operator: String, var _num2: Int) :
    Calculator3(_num1, _operator, _num2) {

    fun add() {
        val test = _num1 + _num2
        println("$_num1 + $_num2 = $test 입니다.")
    }

}

private class SubtractOperation(var _num1: Int,  _operator: String, var _num2: Int) :
    Calculator3(_num1, _operator, _num2) {

    fun subtract() {
        val test = _num1 - _num2
        println("$_num1 - $_num2 = $test 입니다.")
    }

}

private class MultiplyOperation(var _num1: Int, _operator: String, var _num2: Int) :
    Calculator3(_num1, _operator, _num2) {

    fun multiply() {
        val test = _num1 * _num2
        println("$_num1 * $_num2 = $test 입니다.")
    }

}

private class DivideOperation(var _num1: Int, _operator: String, var _num2: Int) :
    Calculator3(_num1, _operator, _num2) {

    fun divide() {
        val test = _num1 / _num2
        println("$_num1 / $_num2 의 몫은 $test 입니다.")
    }

}