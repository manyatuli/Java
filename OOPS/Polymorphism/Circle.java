package OOPS.Polymorphism;

public class Circle extends Shapes{
    public Circle(){
        System.out.println("Triangle Constructor");
    }

    @Override
    void area(){
        System.out.println("Area of circle: 3.14*r*r");
    }
    @Override
    void perimeter(){
        System.out.println("Perimeter of circle: 2*3.14*r");
    }
}
