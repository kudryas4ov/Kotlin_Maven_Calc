package com.epam.sup

class CalcSuperServiceImpl : CalcSuperService {
    override fun addSuper(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }

    override fun multiplySuper(a: Int, b: Int, c: Int): Int {
        return a * b * c
    }

}