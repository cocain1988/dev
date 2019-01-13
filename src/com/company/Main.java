package com.company;


import java.time.LocalDate;

/**
 * Создал файлы для нового раздела
 * @version 0.0.2 2019-12-01
 * @author Khvashchevskiy Mikhail
 *
 */


public class Main {

    public static void main(String[] args)  {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Dick", 60000);
        staff[2] = new Employee("Harry", 65000);

        for(Employee e: staff){
            e.setId();
            System.out.println("ID:"+e.getId()+ "| Name = "+ e.getName() +", salary = "+ e.getSalary());
        }
        int n = Employee.getNextId();
        System.out.println("Next avaleble id = "+n);

    }
}
