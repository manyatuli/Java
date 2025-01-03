package OOPS;


interface Calculator{
    int operation(int a,int b);
}
public class LambdaFunctions {
    public static void main(String[] args) {
        //lambda function without return
        Calculator add = (a,b) -> (a+b);
        Calculator diff =(a,b) ->(a-b);
        Calculator mul = (a,b) -> (a*b);
        Calculator div = (a,b) -> (a/b);

        System.out.println(add.operation(10,20));
        System.out.println(diff.operation(10,5));
        System.out.println(mul.operation(2,30));
        System.out.println(div.operation(50,5));

        //lambda function with return
        Calculator c2 = (int a,int b) -> {
            return a+b;
        };
        System.out.println("With return: "+c2.operation( 100,200));

    }
}
