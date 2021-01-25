package com.epam

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class CalcServiceImplTest {
    private lateinit var calcServiceImpl: CalcServiceImpl

    @BeforeEach
    fun setUp() {
        calcServiceImpl = CalcServiceImpl()
    }

    @Test
    fun addMini() {
        Assertions.assertEquals(5, calcServiceImpl.add(2, 3))
    }

    @Test
    fun multiplyMini() {
        Assertions.assertEquals(6, calcServiceImpl.multiply(2, 3))
    }

    @Test
    fun subtractMini() {
        Assertions.assertEquals(-1, calcServiceImpl.subtract(2, 3))
    }

    @Test
    fun divideMini() {
        Assertions.assertEquals(1, calcServiceImpl.divide(4, 4))
        Assertions.assertEquals(0, calcServiceImpl.divide(4, 0))
    }
}