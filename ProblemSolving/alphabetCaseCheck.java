package ProblemSolving;

import java.util.Scanner;

public class alphabetCaseCheck {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        char alphabet =  in.next().trim().charAt(0);
        System.out.println(alphabet);

        // Approach 1
        System.out.println("Approach 1");
        if(Character.isUpperCase(alphabet)){
            System.out.println("The alphabet is in upper case");
        }
        else{
            System.out.println("The alphabet is in lower case");
        }

        // Approach 2
        System.out.println("Approach 2");
        if(alphabet>='a' && alphabet<='z'){
            System.out.println("Lower case");
        }else{
            System.out.println("Upper case");
        }
    }
}
