package com.csci132.lab2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author : Adiesha
 * @created : 7/8/2022, Friday
 **/
public class CalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void pow() {
        assertEquals(8, Calculator.pow(2, 3), 0.00001);
        assertEquals(2.25, Calculator.pow(1.5, 2), 0.00001);
        assertEquals(15.58845726811989564, Calculator.pow(3, 2.5), 0.000000000000000000001);
    }
}