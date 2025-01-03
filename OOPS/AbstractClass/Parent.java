package OOPS.AbstractClass;

import javax.sound.midi.spi.SoundbankReader;

public abstract class Parent {
    int age;
    String career;
    String name;
    int partnerAge;
    final int children;

    public Parent(int age, String career, String name, int partnerAge) {
        this.age = age;
        this.career = career;
        this.name = name;
        this.partnerAge = partnerAge;
        children=2;
    }

    // abstract constructors cannot be created
//    public abstract Parent(age){
//        System.out.println("I am "+age+ " years old.");
//    }

    static void greeting(){
        System.out.println("Hi, I am an abstract method of the parent class");
    }
    abstract void career(String career);
    abstract void partner(String name,int partnerAge);
}
