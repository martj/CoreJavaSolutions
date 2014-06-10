package com.corejava.examples.oopfun.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.corejava.examples.oopfun.Calculator;

public class CalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        Calculator calc = new Calculator();
        assertEquals(30, calc.calculate("32-2 "));
        assertEquals(5, calc.calculate("3+2"));
        assertEquals(6, calc.calculate("3*2"));
        assertEquals(1, 5, calc.calculate("3/2"));
        // fail("Not yet implemented");
    }

}
