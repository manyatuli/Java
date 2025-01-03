package ProblemSolving;

import java.util.Scanner;

public class countOccurences {
    public static void count(int n, int target){
        int num=n;
        int count=0;
        int digit;
        while(num>0){
            digit=num%10;
            if(digit==target)
                count++;
            num=num/10;
        }
        System.out.println(target+" occurs "+count+" number of times in "+n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=in.nextInt();
        System.out.print("Enter the number whose occurences need to be counted: ");
        int target=in.nextInt();
        count(num,target);
    }
}
