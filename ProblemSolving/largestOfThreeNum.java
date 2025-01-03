package ProblemSolving;

import java.util.Scanner;

public class largestOfThreeNum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int a =  in.nextInt();
        int b =  in.nextInt();
        int c =  in.nextInt();

        System.out.println("The largest number is: ");
        // Approach 1
        System.out.println("Approach 1");
        if(a>b & b>c){
            System.out.println(a);
        }else if(b>a & b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }

        //Approach 2
        System.out.println("Approach 2");
        int max = a;
        if(b>max){
            max=b;
        }else if(c>max){
            max=c;
        }
        System.out.println(max);

        //Approach 3
        System.out.println("Approach 3");
        int m=0;
        if(a>b){
            m=a;
        } else if(b>a){
            m=b;
        }else{
            m=c;
        }
        System.out.println(m);

        //Approach 4
        System.out.println("Approach 4");
        int maximum = Math.max(c,Math.max(a,b));
        System.out.println(maximum);
    }
}
