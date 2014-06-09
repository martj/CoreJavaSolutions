package com.corejava.examples.oopfun.test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.corejava.examples.oopfun.Pair;


public class PairTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        Integer a = new Integer(55);
        Integer b = new Integer(55);
        Integer d = new Integer(56);
        Double c = new Double(53);
        Pair kkk = new Pair();
        assertTrue(kkk.equals(a, b));
        assertFalse(kkk.equals(a, c));
        assertFalse(kkk.equals(a,d));
    }

}
