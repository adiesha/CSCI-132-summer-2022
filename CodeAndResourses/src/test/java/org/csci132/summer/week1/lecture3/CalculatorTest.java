package org.csci132.summer.week1.lecture3;

import junit.textui.TestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author : Adiesha
 * @created : 6/30/2022, Thursday
 **/
public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void multiply() {
        // Test 10 * 10
        assertEquals("10 * 10 should be 100", 100, calculator.multiply(10, 10));
        assertEquals("10.0*10.0 should be 100.0", 100.0, calculator.multiply(10.0, 10.0), 0.0);
    }

    @Test
    public void testMultiplyWithZero() {
        assertEquals("Multiple with zero should be zero", 0, calculator.multiply(0, 5));
        assertEquals("Multiple with zero should be zero", 0, calculator.multiply(5, 0));
    }

    @Test
    public void abs() {

    }

    @Test
    public void isGreaterThan() {
    }
}