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

        staff[0] = new Employee("Carl Cracker", 7000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 5000, 1989, 10, 1 );
        staff[2] = new Employee("Tony Tester ",  4000, 1990, 3,  15);

        for(Employee e : staff)
            e.raiseSalary(3);

        for(Employee e: staff)
            System.out.println("Name = "+ e.getName() +", salary = "+ e.getSalary()+", hireDay = "+ e.getHireDay());

    }
}
