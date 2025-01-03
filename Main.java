import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // print statements

        // 1. System Arguments
        System.out.println(args[0]);
        System.out.println(args[1]);

        // 2. Print in subsequent lines
        System.out.println("Hello and welcome!");

        // 3. Print in same line
        System.out.print("Hello world");

        System.out.println();

        // 4. Taking user input

        Scanner input = new Scanner(System.in);
        // print a single string (w/o spaces)
        System.out.println(input.next());
        // print complete string
        System.out.println(input.nextLine());
        // print integer values
        System.out.println(input.nextInt());
    }
}