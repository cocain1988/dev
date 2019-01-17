package com.company;

import java.util.ArrayList;

public class PersonTest {
    public static void main(String[] args){
        Person[] people = new Person[2];
        people[0] =  new Empoyee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] =  new Student("Maria Morris", "Comprure scince");

        for (Person p: people)
            System.out.println(p.getName()+ " , "+ p.getDescription());

        Empoyee prohoretz = new Empoyee("Kiril Prohoretz", 25000, 1989, 05, 05);

        ArrayList<Empoyee> staff = new ArrayList<>();
        staff.add(new Empoyee("Mikhail Khvashch ", 80000, 1988, 04, 18));
        staff.add(new Empoyee("Kiril Ivanov     ", 8000, 1987, 02, 20));
        staff.add(new Empoyee("Sergey Zhukov    ", 15500, 1985, 03, 01));
        staff.add(new Empoyee("Semion Slepakov  ", 9000, 1984, 11, 15));
        staff.add(new Empoyee("Mikhail Krug     ", 25000, 1978, 04, 18));

        System.out.println("-------");
        System.out.println("Count staff "+staff.size());

        for (Empoyee e: staff)
            System.out.println(e.getName()+"    "+e.getHireDay()+"    "+e.getSalary());

        System.out.println("------- \n После замены");
        staff.set(3, prohoretz);

        for (Empoyee e: staff)
            System.out.println(e.getName()+"    "+e.getHireDay()+"    "+e.getSalary());
    }
}
