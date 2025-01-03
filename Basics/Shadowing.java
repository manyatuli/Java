package Basics;

public class Shadowing {
    static int x= 100;
    public static void main(String[] args) {
        System.out.println(x);
        x = 10; // shadows the global variable x
        System.out.println(x);
        {
            x = 200; // updating x in a scoped block -- shadowing x initialised at line 7
            System.out.println(x);
        }
        fun(x);
    }
    static void fun(int ch){
        System.out.println(x);
        System.out.println(ch);
    }
}
