package com.hackbulgaria.collections.test;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.collections.Utility;

public class UtilityTest {

    LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

    @Before
    public void setUp() throws Exception {
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        Utility test = new Utility();
         assertEquals("{ a:1, b:2, c:3, d:4, e:5, }",
         test.returnReadable(map));
        assertEquals("{ Ninjas:1, are:2, all:2, over:1, the:1, place!:1, We:1, going:1, to:1, die!:1, }",
               test.countEachWords("Ninjas are all over the place! We are all going to die!"));
    }
}
