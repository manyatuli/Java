package OOPS.Polymorphism;

public class Square extends Shapes {
    public Square(){
        System.out.println("Triangle Constructor");
    }

    @Override
    void area(){
        System.out.println("Area of square: side*side");
    }
    @Override
    void perimeter(){
        System.out.println("Perimeter of square: 4*side");
    }
}
