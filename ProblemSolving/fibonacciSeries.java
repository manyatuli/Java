package ProblemSolving;

import java.util.Scanner;

public class fibonacciSeries {

    public static void fibonacci(int num){
        int num1=0;
        int num2=1;
        int sum=1;
        if(num==1){
            System.out.println(num1);
        } else if (num==2) {
            System.out.println(num1);
            System.out.println(num2);
        }else{
            System.out.print(num1+" ");
            System.out.print(num2+" ");
            for(int i=2;i<num;i++){
                System.out.print(sum+ " "); // 1 3
                num1=num2; // 1 1
                num2=sum; // 1 2
                sum=num1+num2; // 2 3
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no of terms in the series: ");
        int num = in.nextInt();
        fibonacci(num);
    }
}

