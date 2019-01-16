package com.company;

public class PersonTest {
    public static void main(String[] args){
        Person[] people = new Person[2];
        people[0] =  new Empoyee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] =  new Student("Maria Morris", "Comprure scince");

        for (Person p: people)
            System.out.println(p.getName()+ " , "+ p.getDescription());

    }
}
