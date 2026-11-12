
package com.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(15, calc.add(10, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(50, calc.multiply(10, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class,
                () -> calc.divide(10, 0));
    }

    @Test
    public void testAddZero() {
        assertEquals(10, calc.add(10, 0));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(-15, calc.add(-10, -5));
    }

    @Test
    public void testMultiplyZero() {
        assertEquals(0, calc.multiply(10, 0));
    }

    @Test
    public void testMaximumInteger() {
        assertEquals(Integer.MAX_VALUE,
                calc.add(Integer.MAX_VALUE, 0));
    }
}
