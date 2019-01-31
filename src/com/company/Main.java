package com.company;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Timer;
//import java.util.Timer;
import javax.swing.*;

public class Main {
    public static void main(String[] args){
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        JOptionPane.showMessageDialog(null, "Quit programm?");
        System.exit(0);

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);

    }



}
