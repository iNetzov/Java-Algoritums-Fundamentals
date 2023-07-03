package Netzov;


import java.util.Scanner;

public class Permutations {
    public static String[] elements;
    public static String[] permutes;
    public static boolean[] used;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        elements = scanner.nextLine().split(" ");
        permutes = new String[elements.length];
        used = new boolean[elements.length];
        permutationNotOptimized(0);
//        permutationOptimized(0);
    }

    private static void permutationOptimized(int index) {
        if (index == elements.length) {
            print(elements);
            return;
        }
        permutationOptimized(index + 1);
        for (int i = index + 1; i < elements.length; i++) {
            swap(elements, index, i);
            permutationOptimized(index + 1);
            swap(elements, index, i);
        }
    }

    private static void swap(String[] arr, int first, int second) {
        String temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;


    }

    private static void permutationNotOptimized(int index) {
        if (index == elements.length) {
            print(elements);
            return;
        }
        for (int i = 0; i < elements.length; i++) {
            if (!used[i]) {
                used[i] = true;
                permutes[index] = elements[i];
                permutationNotOptimized(index + 1);
                used[i] = false;
            }

        }
    }

    private static void print(String[] elements) {
        System.out.println(String.join(" ", elements));
    }

}
