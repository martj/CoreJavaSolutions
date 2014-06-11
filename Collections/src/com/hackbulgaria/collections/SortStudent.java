package com.hackbulgaria.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortStudent {
    public ArrayList<Student> sortStudentByGrade(ArrayList<Student> students) {
        Collections.sort(students, Student.GRADEANDNAME);
        return students;
    }
    /*Start inside class*/
    public static class Student{
        private String name;
        private int grade;
       
        public static Comparator<Student> GRADEANDNAME = new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if (a.grade - b.grade != 0){
                return a.grade - b.grade;
                }else return a.name.compareToIgnoreCase(b.name);
            }
        };
        
        public Student(String name, int grade){
            this.name = name;
            this.grade = grade;
        }
        
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getGrade() {
            return grade;
        }
        public void setGrade(int grade) {
            this.grade = grade;
        }
    }
    /*End inside class*/
}
