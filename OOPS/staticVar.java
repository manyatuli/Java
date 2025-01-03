package OOPS;

class Human{
    String name;
    int age;
    String gender;
    static long population;

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        Human.population+=1; // static var accessed via class name
    }
}
public class staticVar {
    public static void main(String[] args) {
        Human h1 = new Human("Manya",22,"Female");
        Human h2 = new Human("Shaurya",16,"Male");
        Human h3 = new Human("Aarav",14,"Male");
        Human h4 = new Human("Keira",11,"Female");

        System.out.println(Human.population);

        fun();
        // greeting(); // giver error: accessing non-static method inside a static method

        // alternate way
        staticVar obj = new staticVar();
        obj.greeting();
    }

    static void fun(){
        System.out.println("Hi, I am a static method, fun");

        // greeting(); // gives error: accessing non-static method inside a static method

        //alternate way

        // staticVar obj1 = new staticVar();
        // obj1.greeting();
    }

    void greeting(){
        System.out.println("Hi, I am a non-static method, greeting");
        fun(); // static method can be invoked from non-static context
        fun1(); // fun1 will use the same obj for its execution as used by greeting
    }

    void fun1(){
        System.out.println("I am fun2, a non-static method.");
    }
}
