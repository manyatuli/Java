package OOPS;

public class Inheritance {
    public static void main(String[] args) {

//        Box obj = new BoxWeight(1,2,3,4);
//        System.out.println(obj.w+" "+obj.h);
        // length has a private access -- cannot be accessed outside the scope fo the file in which it is defined
//        System.out.println(obj.l);
        // weight cannot be accessed by an objet of the Box class
//        System.out.println(obj.weight);

//        BoxWeight boxwt = new Box(1,2,3);
//        System.out.println(boxwt.weight);

        BoxWeight boxwt = new BoxWeight(10,20,30,40);
        BoxWeight boxwt2 = new BoxWeight(boxwt);

       int x=100;
       int y=300;
       while(++x<--y);
       System.out.println(x);



    }
}
