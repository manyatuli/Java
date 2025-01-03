package OOPS.AbstractClass;

public class Son extends Parent{

    public Son(int age, String career, String name, int partnerAge) {
        super(age, career, name, partnerAge);
        System.out.println("--SON--");
        System.out.println(super.children);
    }

    @Override
    void career(String career){
        System.out.println("I want to be a "+career);
    }

    @Override
    void partner(String name,int age){
        System.out.println("My partner is "+name);
        System.out.println("Her age is "+age);
    }
}
