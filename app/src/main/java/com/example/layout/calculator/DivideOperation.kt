package com.example.layout.calculator

import kotlin.math.round


class DivideOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Any {
        val share = (num1 / num2)

        val remainder = ((num1 % num2) / num2.toDouble())

        val result = share + remainder

        return (round(result * 100) / 100)
    }
}