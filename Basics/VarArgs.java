package Basics;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args){
        fun(1,2,3,4,5,6,7,8,9);
        fun(); // empty arr is passed
        fun1(7,11,"Manya","Shaurya","Keira");
    }
    // here v is implicitly declared as an array of type int
    static void fun(int... v){
        System.out.println(Arrays.toString(v));
    }

    static void fun1(int a, int b, String...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}

