package com.epam

class CalcServiceImpl : CalcService {
    override fun add(a: Int, b: Int) : Int {
       return a + b
    }

    override fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    override fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    override fun divide(a: Int, b: Int): Int {
        if (b == 0) return 0
        return a / b
    }
}