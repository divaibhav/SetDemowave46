/*
Question 2
Create a Set of 10 Student objects, where Student is a user defined class.
Student class contains three private fields int rollNo, String name, and double cpi.
Student class must override String toString() method of Object class.
Try to add duplicate student objects and check whether set is allowing you to add duplicate.
 */
package com.example.data;

import java.util.Objects;

public class Student {
    private int rollNo;
    private String name;
    private double cpi;


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", cpi=" + cpi +
                '}';
    }
    @Override
    public boolean equals(Object o){
        System.out.println("equals method called");
        if(this == o){
            return true;
        }
        if(  o instanceof Student ){
            Student student = (Student) o;
            if(this.name.equals(student.getName()) && this.cpi == student.getCpi() && this.rollNo == student.rollNo){
                return true;
            }else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        System.out.println("hash code called");
        return Objects.hash(rollNo, name, cpi);
    }
}
