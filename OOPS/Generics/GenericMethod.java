package OOPS.Generics;

public class GenericMethod {

    public static <E> void printArray(E[] elements){
        for (E ele: elements){
            System.out.println(ele);
        }
    }

    public static void main(String[] args) {
        Integer[] intArr = {10,20,30,40,50};
        Character[] chArr = {'a','b','c'};
        String[] strArr = {"Manya","Shaurya","Keira","Aarav"};

        printArray(intArr);
        printArray(chArr);
        printArray(strArr);
    }
}
