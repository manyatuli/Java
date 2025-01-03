package OOPS.AbstractClass;

public class Main {
    public static void main(String[] args) {

        Daughter d= new Daughter(28, "Engineer","ABC", 28);

        d.career("Engineer");
        d.partner("ABC",28);

        Son s = new Son(27, "Doctor","XYZ",27);
        s.career("Doctor");
        s.partner("XYZ",27);

        // objects of abstract classes cannot be created
        //Parent p= new Parent();

        // accessing abstract method of Parent class
        Parent.greeting();
    }
}
