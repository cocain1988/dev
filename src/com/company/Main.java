package com.company;


import java.time.LocalDate;
import java.util.EnumMap;

/**
 * Создал файлы для нового раздела
 * @version 0.0.2.1 2019-16-01
 * @author Khvashchevskiy Mikhail
 *
 */


public class Main {
    /**
     * @author Khvashchevskiy Mikhail
     * @version 0.0.2.1
     * @param args
     *
     * Тестируем документирование окода.
     */

    /**
     * Это главная функция самого класса чтобы было рабочее простаранство.
     *
     */
    public static void main(String[] args)  {

        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

        for (Employee e: staff)
            System.out.println("Name = "+e.getName() + " , salary = "+ e.getSalary());
    }

}
