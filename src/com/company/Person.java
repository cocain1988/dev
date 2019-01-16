package com.company;

public abstract class Person {
    public abstract String getDescription();
    private String Name;

    public Person(String aName){
        this.Name = aName;
    }

    public String getName(){
        return Name;
    }
}
