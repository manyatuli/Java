package OOPS.Polymorphism;

public class Triangle extends Shapes {
    public Triangle(){
        System.out.println("Triangle Constructor");
    }

    @Override
    void area(){
        System.out.println("Area of triangle: 0.5*b*h");
    }
    @Override
    void perimeter(){
        System.out.println("Perimeter of triangle: side1+side2+side3");
    }
}
