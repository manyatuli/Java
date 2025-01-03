package OOPS;

public class staticBlock {
        static int a=10;
        static int b;

        // static block
        static{
            System.out.println("I am in the static block");
            b=a*10;
        }

    public static void main(String[] args) {
        System.out.println(a+" "+b);

        staticBlock obj = new staticBlock();
        System.out.println(obj.a+" "+obj.b);

        staticBlock obj2=new staticBlock();
        a=200;
        System.out.println(obj2.a+" "+obj2.b);
    }
}
