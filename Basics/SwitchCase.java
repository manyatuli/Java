package Basics;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a fruit's name (mango/orange/apple/grapes): ");
        String s = in.next();

        System.out.print("The fruit is colored: ");

        // Syntax 1
        switch(s){
            case "mango":
                System.out.println("yellow");
                break;
            case "apple":
                System.out.println("red");
                break;
            case "orange":
                System.out.println("orange");
                break;
            default:
                System.out.println("purple");
        }

        // Syntax 2: enhanced switch statements
        switch (s) {
            case "mango" -> System.out.println("yellow");
            case "apple" -> System.out.println("red");
            case "orange" -> System.out.println("orange");
            default -> System.out.println("purple");
        }

        System.out.println("Enter a day of the week (from 1-7): ");
        int d=in.nextInt();
        switch(d){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }

        //Enhanced switch
        switch (d) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
