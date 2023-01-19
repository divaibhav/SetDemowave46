package com.example.impl;

import com.example.data.Student;

import java.util.*;

public class StudentImpl {
    public static void main(String[] args) {

        ArrayList<Student>  studentArrayList = new ArrayList<>();

        Student s1 = new Student();
        s1.setRollNo(10);
        s1.setName("Vaibhav");
        s1.setCpi(6.5);
        Student s2 = new Student();
        s2.setRollNo(20);
        s2.setName("Ramesh");
        s2.setCpi(6.5);
        Student s3 = new Student();
        s3.setRollNo(20);
        s3.setName("Ramesh");
        s3.setCpi(6.5);
        Set<Student> studentSet = new HashSet<>();
        System.out.println("studentSet.add(s1) = " + studentSet.add(s1));
        System.out.println("studentSet.add(s2) = " + studentSet.add(s2));
        System.out.println("studentSet.add(s3) = " + studentSet.add(s3));
        System.out.println("studentSet = " + studentSet);

        //TreeSet
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(150);
        integerTreeSet.add(56);
        integerTreeSet.add(75);
        System.out.println("integerTreeSet = " + integerTreeSet);

        //TreeSet
       /* TreeSet<Student> studentTreeSet = new TreeSet<>();
        System.out.println("studentTreeSet.add(s1) = " + studentTreeSet.add(s1));*/
        System.out.println("s2.hashCode() = " + s2.hashCode());
        System.out.println("s3.hashCode() = " + s3.hashCode());
    }

}
