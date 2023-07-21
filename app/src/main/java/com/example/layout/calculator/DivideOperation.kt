package com.example.layout.calculator

import kotlin.math.round
import kotlin.math.roundToInt


class DivideOperation {
    fun operate(num1: Int, num2: Int): Double {
        val share = (num1 / num2)

        val remainder = ((num1 % num2) / num2.toDouble())

        val result = share + remainder

        return (round(result*100)/100)
    }
}