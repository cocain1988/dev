package com.company;

import java.time.LocalDate;

public class Employee {
    private static int nextId = 1;
    private final String name;
    private double salary;
    private int id;

    public Employee(String n, double s){
        name = n;
        salary = s;
    }

    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public int getId(){
        return id;
    }
    public void setId(){
        id = nextId;
        nextId++;
    }
    public static int getNextId(){
        return nextId;
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
