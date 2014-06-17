package com.hackbulgaria.collections.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.collections.Rotate;

public class RotateTest {
    Rotate test = new Rotate();
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    @Before
    public void setUp() throws Exception {
          list.add(1);
          list.add(2);
          list.add(3);
          list.add(4);
          list.add(5);
          list.add(6);
          list.add(7);
          
          list1.add(5);
          list1.add(6);
          list1.add(7);
          list1.add(1);
          list1.add(2);
          list1.add(3);
          list1.add(4);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        assertTrue(list1.equals(test.rotate(list, 3)));
        //fail("Not yet implemented");
    }

}
