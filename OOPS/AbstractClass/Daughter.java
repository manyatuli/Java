package OOPS.AbstractClass;

public class Daughter extends Parent{

    public Daughter(int age, String career, String name, int partnerAge) {
        super(age, career, name, partnerAge);
        System.out.println("--DAUGHTER--");
        System.out.println(super.children);
    }

    @Override
    void career(String career){
        System.out.println("I want to be a "+career);
    }

    @Override
    void partner(String name,int age){
        System.out.println("My partner is "+name);
        System.out.println("His age is "+age);
    }
}
