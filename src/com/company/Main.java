package com.company;

/**
 * Это первый комметарий для пробы:
 * @version 0.0.1 2019-08-01
 * @author Khvashchevskiy Mikhail
 *
 */


public class Main {

    public static final String MAX_STRING = "FIX_BUG";
    public static final Size s = Size.SMALL;

    public static void main(String[] args) {
        char dataChar       = 'B';
        int dataInt         = 1234567891;
        double dataDouble   = 1.5488d;
        float dataFloat     = 458.254F;
        String dataString   = "Sthis string data";
        byte dataByte       = 100;
        short dataShort     = 12313;
        boolean dataBoolean = true;
        String greeting     = "Hello world";
        String sb           = greeting.substring(0,3);
        String str          = "Java is a powerfull language!";

        //String all = String.join("/","S", "M", "L", "XL");

	    System.out.println("Test java 8");
	    System.out.println(greeting);
	    System.out.println(sb);
	    //System.out.println(all);

	    str = null;

	    if(str != null && str.length() != 0){
	        System.out.println("Все работает строка содержит: " +str);
        }else{
	        System.out.println("Не отработала проверка на null ");
        }

	    System.out.println("This char: "+dataChar);
        System.out.println("This String: "+dataString);
        System.out.println("This logical: "+dataBoolean);
        System.out.println("This Byte: "+dataByte);
        System.out.println("This Short: "+dataShort);
        System.out.println("This Int: "+dataInt);
        System.out.println("This Double: "+dataDouble);
        System.out.println("This float: "+dataFloat);



    }
}
