package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BasicSyntax {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);

        // taking user input
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }

        // printing the elements
        for (int j : arr) {
            System.out.println(j);
        }

        // printing the arr  using toString
        System.out.println(Arrays.toString(arr));
    }
}
