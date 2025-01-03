package Basics;

import java.util.Arrays;

public class PassbyVal_RefOfVal {
    public static void main(String[] args){
        // arr obj
        int[] arr =  {1,2,3,4,5};
        // primitives
        char c ='m';
        byte b = 123;
        // non-primitives
        String name= "Manya";

        modify(arr,c,b,name);
        System.out.println(Arrays.toString(arr));
        System.out.println(c);
        System.out.println(b);
        System.out.println(name);
    }
    public static void modify (int[] num,char ch,byte b,String name){
        num[0]=100; // changing object via 1 ref var
        int[] num2=num;
        num2[1]=200; // changing object by creating a new ref var
        ch = 'a'; // new object created, no modification of char
        b = 7; // new obj created
        name = "Shaurya"; // new obj created
    }
}
