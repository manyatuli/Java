package OOPS;

class S{
    String name;
    S(String n){
        this.name = n;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Destroying the object");
    }
}

public class finalKeyword {
    public static void main(String[] args){

        // Primitives
        final int a=10;
        // a=12; // throws error: primitive declared as final is being reinitialised
        System.out.println(a);

        // Non-Primitives
        final S s1 = new S("Manya");
        s1.name="Shaurya"; // changing the obj value -- allowed with final
        System.out.println(s1.name);
        // s1= new S("Keira"); // gives error as object ref is being changed

        S obj;
        for (int i=0;i<1000000;i++){
            obj=new S("Hello");
        }

    }
}
