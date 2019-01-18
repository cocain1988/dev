package com.company;

public class Mutation implements Mutable{
    private String Name;
    private double codeMutation;
    private Mutable mutable;

    public Mutation(String MutationName, double code){
        this.Name = MutationName;
        this.codeMutation =code;
    }

    @Override
    public double getMutableCode() {
        return 0;
    }

    @Override
    public void setMutable(Mutation mt) {

    }

    @Override
    public String getMutationName() {
        return null;
    }

    @Override
    public Mutable getMutation(){
        return null;
    }
}
