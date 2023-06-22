package Netzov;


public class KeyLock02 {

    public static void main(String[] args) {
        long counter = 0;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                            System.out.printf("%d_%d_%d_%d_%d\n", i, j, k, l, m);
                            counter++;
                        }
                    }
                }
            }
        }
        //this is our algorithm
        System.out.println(Math.pow(10, 5));
        //this is our algorithm if we include a-z + 0-9
        System.out.println((long) Math.pow(36, 5));

        System.out.println(counter);
    }
}
