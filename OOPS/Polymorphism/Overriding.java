package OOPS.Polymorphism;

public class Overriding {
    public static void main(String[] args) {
        Shapes obj = new Triangle();
        obj.area();
        obj.perimeter();

        Shapes obj1 = new Circle();
        obj1.area();
        obj1.perimeter();

        Shapes obj2 = new Square();
        obj2.perimeter();
        obj2.area();
    }
}
