package com.company;

import java.awt.event.ActionListener;
import java.util.Arrays;
//import java.util.Timer;
import javax.swing.*;

public class Main {
    public static void main(String[] args){
        String[] planets = new String[] {
                "Mercury", "Verus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"
        };
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length: ");
        Arrays.sort(planets,
                (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

    }
}
