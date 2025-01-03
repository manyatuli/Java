package OOPS;

public class Main {
    public static void main(String[] args) {
        singletonClass obj = singletonClass.getInstance();
        singletonClass obj1= singletonClass.getInstance();
        singletonClass obj2 = singletonClass.getInstance();
    }
}
