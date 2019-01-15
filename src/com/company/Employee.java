package com.company;

import java.time.LocalDate;

/**
 * @author Khvashchevskih Mikhail
 * @version 0.0.2
 */
public class Employee {
    private String name;
    private double salary;

    public Employee(String n, double s){
        name = n;
        salary = s;
    }

    /**
     *
     * @return Данная функция возвращает имя сотрудника.
     */
    public String getName(){
        return name;
    }

    /**
     * @return Данный метод возвращает текущую зарплату сотрудника.
     */
    public double getSalary(){
        return salary;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary+=raise;
    }
}
