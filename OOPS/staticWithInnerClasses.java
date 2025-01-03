package OOPS;

//class Test{
//    String name;
//    public Test(String name) {
//        Test.name=name;
//    }
//}

public class staticWithInnerClasses {

    static class Test  {
        String name;
        public Test(String name) {
            this.name=name;
        }
    }

    public static void main(String[] args) {
        Test a= new Test("Manya");
        Test b= new Test("Shaurya");
        System.out.println(a.name);
        System.out.println(b.name);
//        System.out.println(Test.name);
//        System.out.println(Test.name);
    }
}
