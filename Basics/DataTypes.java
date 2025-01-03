package Basics;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args){
        int rollno  = 7;
        long largeIntegerValues = 123343444323L;
        System.out.println(rollno);
        System.out.println(largeIntegerValues);

        float pi= 3.14f;
        double largeFloatValues = 12238240434.24324;
        System.out.println(pi);
        System.out.println(largeFloatValues);

        // notice the single and double quotes
        char letter = 'm';
        String name = "Manya";
        System.out.println(letter);
        System.out.println(name);

        boolean flag = true;
        boolean falseFlag= false;
        System.out.println(flag);
        System.out.println(falseFlag);

        //Integer wrapper class -- used to enhance the functionalities of the integer primitive
        Integer no = 7;
        System.out.println(no.compareTo(8));
        System.out.println(no.compareTo(6));
        System.out.println(no.compareTo(7));

        // User Inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("The entered num is: "+ num);

        System.out.print("Enter a string: ");
        String str= input.next();
        System.out.println("The entered string is: " + str);
        str = input.nextLine();
        System.out.println("The entered string is: " + str);

        // say one wants to print 234 m
        int amt=234_000_000;
        System.out.println("The entered amt is: "+amt);
    }
}
