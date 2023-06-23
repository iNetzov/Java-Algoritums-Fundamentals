package Netzov;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GenerateByteVector03 {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int vectorL = Integer.parseInt(scanner.nextLine());
        Integer[] memory =  new Integer[vectorL];
        generateVector(memory,0);
    }

    private static void generateVector(Integer[] memory, int index) {
        if (index >= memory.length) {
            print(memory);
            return;
        }
        for (int i = 0; i <= 1; i++) {
        memory[index] = i;
        generateVector(memory,index + 1);
        }

    }

    private static void print(Integer[] memory) {
        System.out.println(Arrays
                .stream(memory)
                .map(String :: valueOf)
                .collect(Collectors.joining("")));

    }
}
