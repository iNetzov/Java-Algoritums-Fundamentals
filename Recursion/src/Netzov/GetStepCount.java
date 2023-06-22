package Netzov;

import java.util.Scanner;

public class GetStepCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Expect number:");
        long input = Long.parseLong(scanner.nextLine());
        long counter = 0;
        for (int i = 0; i < input; i++) { // it will be executed n numbers
            for (int j = 0; j < input; j++) {  //it will be executed nXn  *//
                counter++;  //so algorithm complexity is nXn
            }
        }
        System.out.println(counter);
    }
}
