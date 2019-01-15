package com.company;


import java.time.LocalDate;
import java.util.EnumMap;

/**
 * Создал файлы для нового раздела
 * @version 0.0.2 2019-12-01
 * @author Khvashchevskiy Mikhail
 *
 */


public class Main {
    /**
     * @author Khvashchevskiy Mikhail
     * @version 0.0.2
     * @param args
     *
     * Тестируем документирование окода.
     */

    /**
     * Это главная функция самого класса чтобы было рабочее простаранство.
     *
     */
    public static void main(String[] args)  {

        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent="+percent);
        tripleValue(percent);
        System.out.println("After: percent="+percent);

        System.out.println("Testing tripleSalary:");
        Employee harry = new Employee("Harry", 50000);
        System.out.println("Before: salary="+ harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary="+harry.getSalary());

        System.out.println("Testing swap:");
        Employee a = new Employee("Alice", 70000);
        Employee b = new Employee("Bob", 60000);

        System.out.println("Before: a="+a.getName());
        System.out.println("Before: b="+b.getName());
        swap(a, b);
        System.out.println("After: a="+a.getName());
        System.out.println("After: b="+b.getName());
    }

    /**
     * Процедура прокачки сотрудников, а точнее замены.
     * @param x Сотрудник один
     * @param y Сотрудник 2
     */
    public static void swap(Employee x, Employee y){
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println(" --> End of method: x="+x.getName());
        System.out.println(" --> End of method: y="+y.getName());
    }

    public static void tripleValue(double x){
        x = 3* x;
        System.out.println(" --> End of method: x="+x);
    }

    public static void tripleSalary(Employee x){
        x.raiseSalary(200);
        System.out.println(" --> End of method: salary="+x.getSalary());
    }
}
