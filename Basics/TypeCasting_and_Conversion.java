package Basics;

import java.util.Scanner;

public class TypeCasting_and_Conversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Type Conversion
        System.out.print("Enter a floating pt number: ");
        float dec  = input.nextFloat();
        System.out.println("The entered floating pt number is : " + dec);

        // Type Casting
        int num = (int)(3.14f);
        System.out.println("The num is: "+num);

        //Automatic type promotion in Java

        // A byte can store max val of 256, when the expression for d is evaluated, java does the type promotion for  a and b into 'int' so that the evaluated values even exceeding 256 can be stored
        byte a = 10;
        byte b = 20;
        byte c = 100;
        int d = a*b/c;
        System.out.println(d);

//        byte e = 100;
//        // Flags error
//        e=e*3; // the expression is evaluated as int so the result cannot be stored in a byte
//        System.out.println(e);

        // ASCII conversion
        int temp='A';
        System.out.println(temp);


    }
}
