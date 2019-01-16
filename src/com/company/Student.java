package com.company;

public class Student extends Person {
    private String major;

    public Student(String aName, String aMajor){
        super(aName);
        this.major = aMajor;
    }

    public String getDescription(){
        return " a student majoring in "+major;
    }
}
