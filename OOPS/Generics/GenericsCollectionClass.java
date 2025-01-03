package OOPS.Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsCollectionClass {
    public static void main(String[] args) {

        //ArrayList collection class
        ArrayList<String> list = new ArrayList<String>();
        list.add("Manya");
        list.add("Shaurya");
        // list.add(10);
        System.out.println((list));

        String s = list.get(1);//type casting is not required
        System.out.println("element is: " + s);

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
