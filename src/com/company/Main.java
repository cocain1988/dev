package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;
import java.time.*;

import static java.lang.Thread.sleep;

/**
 * Это первый комметарий для пробы:
 * @version 0.0.1 2019-08-01
 * @author Khvashchevskiy Mikhail
 *
 */


public class Main {

    public static final String MAX_STRING = "FIX_BUG";
    public static final Size s = Size.SMALL;

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, InterruptedException {
        char dataChar = 'B';
        int dataInt = 1234567891;
        double dataDouble = 1.5488d;
        float dataFloat = 458.254F;
        String dataString = "Sthis string data";
        byte dataByte = 100;
        short dataShort = 12313;
        boolean dataBoolean = true;
        String greeting = "Hello world";
        String sb = greeting.substring(0, 3);
        String str = "Java is a powerfull language!";

        //String all = String.join("/","S", "M", "L", "XL");

        System.out.println("Test java 8");
        System.out.println(greeting);
        System.out.println(sb);
        //System.out.println(all);

        str = null;

        if (str != null && str.length() != 0) {
            System.out.println("Все работает строка содержит: " + str);
        } else {
            System.out.println("Не отработала проверка на null ");
        }

        System.out.println("This char: " + dataChar);
        System.out.println("This String: " + dataString);
        System.out.println("This logical: " + dataBoolean);
        System.out.println("This Byte: " + dataByte);
        System.out.println("This Short: " + dataShort);
        System.out.println("This Int: " + dataInt);
        System.out.println("This Double: " + dataDouble);
        System.out.println("This float: " + dataFloat);

        String StringForFileOutput = "Это будет огромный текст для того чтобы можно было попробовать вывести данные в файл и посмотреть потом что получится." +
                "Теперь новая строка, посомтрим попадет она туда или нет." +
                "и еще одна строка";

        PrintWriter out = new PrintWriter("C:\\file.dat", "UTF-8");

        out.write(StringForFileOutput);

        //System.out.println("Введите что-то в строку ниже:");
        //Scanner in = new Scanner(System.in);
        //String name = in.nextLine();
        //System.out.println("Вы ввели: "+name);

        //System.out.println("Попробуем ввести с пробелами используя next()");
        //Scanner in2 = new Scanner(System.in);
        //String anyString = in2.next();
        //System.out.println(anyString);

        int yourSales = 3;
        int target = 5;
        double perfomance = 0.0;

        if (yourSales >= target) {
            perfomance = 100 + 0.01 * (yourSales - target);
        } else {
            perfomance = 1;
        }
        System.out.println(perfomance);

        char ch[] = new char[5];

        ch[0] = '|';
        ch[1] = '/';
        ch[2] = '-';
        ch[3] = '\\';
        //ch[4] = '|';

        for (int j = 0; j <= 5; j++) {
            for (int i = 0; i <= 3; i++) {
                System.out.print(ch[i]);
                sleep(100);
                System.out.print("\r");
            }

        }

        Size size = Size.XXL;

        switch (size) {
            case SMALL:
                System.out.println(" Chouse Small");
                break;
            case LARGE:
                System.out.println("Chose large");
                break;
            case MEDIUM:
                System.out.println("chose MEDIUM");
                break;
            case EXTRA_LARGE:
                System.out.println("chose exra large");
                break;
            default:
                System.out.println("Choosen default size.");
        }

        //Arrays
        // =================================================================
        int[] a = new int[10];
        a[0] = 15;
        a[1] = 25;
        a[2] = 96;
        a[3] = 77;
        a[4] = 85;
        a[5] = 65;
        a[6] = 36;
        a[7] = 93;

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ,");

        int[] anonymus = {58, 87, 1, 89, 879, 3, 9, 25, 14, 55, 96};
        int[] luckyNumbers = anonymus;
        luckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
        Arrays.sort(luckyNumbers);

        System.out.println(" ");

        System.out.println("See anonymus array:");
        for (int i = 0; i < anonymus.length; i++)
            System.out.print(anonymus[i]+" ");

        System.out.println(" ");

        System.out.println("See luckyNymbers:");
        for (int i = 0; i<luckyNumbers.length; i++)
            System.out.print(luckyNumbers[i]+" ");

        int [] [] maigicSquare = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}
        };

        System.out.println(" \n -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- ");

        final int NRATES = 6;
        final int NYARS = 10;
        final double STARTRATE = 10;

        double[] interestRate = new double[NRATES];
        for (int j = 0; j<interestRate.length; j++)
            interestRate[j] = (STARTRATE + j) / 100.0;

        double [] [] balances = new double[NYARS][NRATES];
        for (int j = 0; j < balances[0].length; j++)
            balances[0][j] = 10000;

        for (int i = 1; i< balances.length; i++){
            for (int j = 0; j < balances[i].length; j++){
                double oldBalance = balances[i - 1][j];
                double interest = oldBalance * interestRate[j];
                balances[i][j] = oldBalance + interest;
            }
        }

        for (int j = 0; j<interestRate.length; j++)
            System.out.printf("%9.0f%%", 100*interestRate[j]);

        System.out.println();

        for (double[] row : balances){
            for (double d: row)
                System.out.printf("%10.2f", d);
            System.out.println();
        }
    }
}
