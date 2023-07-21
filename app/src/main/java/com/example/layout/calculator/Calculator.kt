package com.example.layout.calculator


fun main() {
    println("계산기 ON")
    println("첫번째 숫자, 수식, 두번째 숫자를 순서대로 입력해주세요")
    val calc = Calculator()
    val number1 = calc.num1
    val operation = calc.operation
    val number2 = calc.num2

    if (calc.calculator() == null) {

        println("수식이 잘못 입력되었습니다")

    } else {

        println("$number1 $operation $number2 = ${calc.calculator()} 입니다")

    }

    println("계산기 OFF")

}

class Calculator {

    val num1 = readLine()!!.toInt()
    val operation = readLine()!!.toString()
    val num2 = readLine()!!.toInt()

    fun calculator(): Any? {

        return when (operation) {
            "+" -> {

                AddOperation().operate(num1, num2)

            }

            "-" -> {

                SubtractOperation().operate(num1, num2)

            }

            "*" -> {

                MultiplyOperation().operate(num1, num2)

            }

            "/" -> {

                DivideOperation().operate(num1, num2)
                //소수점 2번째 자리까지 반올림으로 표현

            }

            else -> {
                null
            }
        }
    }
}

