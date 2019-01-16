package com.company;

import java.time.LocalDate;

/**
 * @author Khvashchevskih Mikhail
 * @version 0.0.2
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String aName, double aSalary, int year, int month, int day){
        name = aName;
        salary = aSalary;
        hireDay = LocalDate.of(year, month, day);
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

    /**
     * Ментод по возврату данных даты приема на работу
     * @return возвращается дата приема на работу.
     */
    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary+=raise;
    }
}
