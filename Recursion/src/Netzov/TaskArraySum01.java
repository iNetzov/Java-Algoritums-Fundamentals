package Netzov;

import java.util.Arrays;
import java.util.Scanner;

public class TaskArraySum01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

//        iteration
        iteration(array);

//        reverse Iteration
        reverseIteration(array);

//    recursion
        System.out.println("Recursion Sum:" + recursion(array, 0));
//        reverseRecursion
        System.out.println("Reversed recursion Sum:" + reverseRecursion(array, array.length - 1));
    }


    private static int recursion(int[] numbers, int index) {
        if (index >= numbers.length) {
            return 0;
        }
        return numbers[index] + recursion(numbers, index + 1);
    }

    private static int reverseRecursion(int[] number, int index) {
        if (index < 0) {
            return 0;
        }
        int currentNumber = number[index];
        int nextNumber = reverseRecursion(number, index - 1);
        int sum = currentNumber + nextNumber;
        return sum;
    }

    public static void iteration(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Iteration sum: " + sum);
    }

    public static void reverseIteration(int[] array) {
        int sum = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            sum += array[i];
        }
        System.out.println("Reverse Iteration sum: " + sum);
    }
}
