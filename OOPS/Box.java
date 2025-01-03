package OOPS;

public class Box {
    private float l;
    float w;
    float h;

    public Box(float l, float w, float h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public Box(Box b){
        System.out.println("Copy Constructor of Box");
        this.l=b.l;
        this.w=b.w;
        this.h=b.h;
    }
}
