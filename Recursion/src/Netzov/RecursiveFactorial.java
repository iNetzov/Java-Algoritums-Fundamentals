package Netzov;

import java.util.Scanner;

public class RecursiveFactorial {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n  = Integer.parseInt(scanner.nextLine());
        System.out.println("Recursive: " + recursionFactorial(n));
        System.out.println("Iterative: " + iterativeFactorial(n));
    }

    private static int recursionFactorial(int n) {
        if (n == 1) {
            return 1;
        }
       return n * recursionFactorial(n - 1);
    }

    private static int iterativeFactorial(int n) {
        ;
        int  fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
