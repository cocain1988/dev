package com.company;

import java.awt.event.ActionListener;
//import java.util.Timer;
import javax.swing.*;

public class Main {
    public static void main(String[] args){
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(10000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
