package Basics;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args){
        System.out.println(fun(7,11));
        fun("Manya","Shaurya","Keira");

        // Var args
        demo(1,2,3);
        demo("Hello","Bonjour","Hola");
//        demo(); // error due to ambiguity at compile time

    }

    static int fun(int a, int b){
        System.out.print("The sum of "+a+" and "+b+" is: ");
       return a+b;
    }

    static void fun(String a, String b, String c){
        System.out.println("Hi"+" "+a);
        System.out.println("Hi"+" "+b);
        System.out.println("Hi"+" "+c);
    }

    static void demo(String... s){
        System.out.println(Arrays.toString(s));
    }
    static void demo(int... i){
        System.out.println(Arrays.toString(i));
    }
}
