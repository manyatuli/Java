package Basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Till where do you want to print the numbers?  ");
        int n = in.nextInt();
        int i=0;

        // for loop
        System.out.println("Executing the for loop");
        for (i=0;i<=n;i++){
            System.out.println(i);
        }

        // while loop           
        System.out.println("Executing the while loop");
        i=0;
        while(i<=n){                                               
            System.out.println(i);
        }

        // do while loop
        System.out.println("Executing the do-while loop");
        i=0;
        do{
            System.out.println(i);
            i+=1;
        }while(i<=n);

    }
}
