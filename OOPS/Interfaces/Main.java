package OOPS.Interfaces;

public class Main implements A,B{

    @Override
    public void hello() {
        System.out.println("HI");
    }

    @Override
    public void greeting() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Main obj=new Main();
        obj.hello();
        obj.greeting();
    }
}
