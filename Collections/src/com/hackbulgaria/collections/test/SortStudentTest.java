package com.hackbulgaria.collections.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.collections.SortStudent;
import com.hackbulgaria.collections.SortStudent.Student;
    
public class SortStudentTest {

        Student a = new Student("Pesho" , 4);
        Student b = new Student("Gosho" , 3);
        Student c = new Student("Haboril", 6);
        Student d = new Student("Chichaka", 6);
        Student e = new Student("Debeliq", 2);
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Student> sorted = new ArrayList<>();
        SortStudent test = new SortStudent();
        @Before
        public void setUp() throws Exception {
            students.add(a);
            students.add(b);
            students.add(c);
            students.add(d);
            students.add(e);
            
            sorted.add(e);
            sorted.add(b);
            sorted.add(a);
            sorted.add(d);
            sorted.add(c);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        assertEquals(sorted, test.sortStudentByGrade(students));
    }

}
