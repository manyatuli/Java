package OOPS.Interfaces;

public class NestedInterface {
    public interface NI{
        boolean odd(int num);
    }

    public static void main(String[] args) {
        C obj= new C();
        System.out.println(obj.odd(6));
    }
}

class C implements NestedInterface.NI{
    @Override
    public boolean odd(int num) {
        return (num & 1)== 1;
    }
}
