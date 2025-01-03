package ProblemSolving;

public class primeNumber {
    public static void main(String[] args) {
        isPrime(36);
    }

    public static void isPrime(int num) {
        if (num == 0 || num == 1) {
            System.out.println("Non-Prime");
        }
        else {
            int i = 2;
            int flag=0;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    System.out.println("Non-Prime");
                    flag=1;
                    break;
                }
                i++;
            }
            if(flag==0) {
                System.out.println("Prime");
            }
        }
    }
}
