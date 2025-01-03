package OOPS.Generics;

public class GenericClass {

    public static class Test<T>{
        T obj;
        void add(T obj){
            this.obj=obj;
        }
        T get(){
            return obj;
        }
    }

    public static void main(String[] args) {
        Test<Integer> t = new Test<Integer>();
        t.add(2);
       // t.add("manya"); // throws an error
        System.out.println(t.get());
    }
}
