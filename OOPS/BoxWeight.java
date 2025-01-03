package OOPS;

public class BoxWeight extends Box {
    float weight;

    public BoxWeight(float l, float w, float h, float weight) {
        // call base class constructor
        super(l, w, h);

        this.weight = weight;

        // Using in place of 'this' keyword
//        System.out.println(super.w);
//        System.out.println(super.h);
//
//        System.out.println(this.weight);
    }

    public BoxWeight(BoxWeight box){
        super(box);
        System.out.println("Copy Constructor of Box Weight");
        System.out.println(box.h);
        System.out.println(box.w);
    }

}
