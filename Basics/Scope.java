package Basics;

public class Scope {
    public static void main(String[] args){

        // initialisation
        int a = 10;
        {
            a=100; //updation
            int b = 20;
        }
        System.out.println(a);
//        System.out.println(b); // throws error: outside the scope fo the block

//        b=2000; // throws error
        int b = 200; // reinitialised 'b' outside the scope of the block.
        System.out.println(b);
    }
}
