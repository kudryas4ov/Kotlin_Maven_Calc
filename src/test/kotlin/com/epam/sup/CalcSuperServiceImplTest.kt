package com.epam.sup

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class CalcSuperServiceImplTest {
    private lateinit var calcSuperServiceImpl: CalcSuperServiceImpl

    @BeforeEach
    fun setUp() {
        calcSuperServiceImpl = CalcSuperServiceImpl()
    }

    @Test
    fun addSuper() {
        Assertions.assertEquals(9, calcSuperServiceImpl.addSuper(2, 3, 4))
    }

    @Test
    fun multiplySuper() {
        Assertions.assertEquals(24, calcSuperServiceImpl.multiplySuper(2, 3, 4))
    }
}