package com.company;

import java.time.LocalDate;

public class Empoyee extends Person {

    private double salary;
    private LocalDate hireDay;

    public Empoyee(String name, double salary, int year, int month, int day){
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public double getSalary(){
        return salary;
    }

    public String getDescription(){
        return String.format("an employee with a salary of $%.2f", salary);
    }

}
