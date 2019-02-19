package com.company;


import java.time.LocalDate;


public class Main {

    public static void main(String[] args){
        LocalDate[] birthDays = {
                LocalDate.of(1906, 12, 9),
                LocalDate.of(1815, 12, 10),
                LocalDate.of(1903, 12, 3),
                LocalDate.of(1910, 6, 22),
        };

        Pair<LocalDate> mm = ArrayAlg.minmax(birthDays);
        System.out.println("Min = "+ mm.getFirst());
        System.out.println("Max = "+mm.getSecond());
    }

}
