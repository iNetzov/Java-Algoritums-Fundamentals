package Netzov;

import java.util.Scanner;

public class DrawingWithRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

//        iterativeDrawing(input);
        recursionDrawing(input);
    }

    private static void recursionDrawing(int input) {
//        Pre-action
        if (input == 0) {
            return;
        }

        for (int i = 0; i < input; i++) {
            System.out.print("*");
        }
        System.out.println();
//        Recursion Call
        recursionDrawing(input - 1);
//        Post-action
        for (int i = input; i > 0; i--) {
            System.out.print("#");
        }
        System.out.println();
    }

    private static void iterativeDrawing(int input) {
        for (int i = 0; i <= input; i++) {
            String dotLine = "";
            for (int j = 0; j <= input - i; j++) {
                String dot = "#";
                dotLine += dot;
            }
            System.out.println(dotLine);
        }

        for (int i = input; i > 0; i--) {
            String dotLine = "";
            for (int j = 0; j <= input - i; j++) {
                String dot = "*";
                dotLine += dot;
            }
            System.out.println(dotLine);
        }
    }
}
