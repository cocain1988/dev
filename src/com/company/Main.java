package com.company;



public class Main {

    public static void main(String[] args){
        double[] d =  new double[20];
        for(int i = 0; i < d.length; i++)
            d[i] = 100 * Math.random();
        ArrayAlg.Pair p = ArrayAlg.minmax(d);
        System.out.println("min = "+ p.getFirst());
        System.out.println("max = "+ p.getSecond());
    }

}
