// Write a program that creates a Random object and displays the first 100 random integers between 1 and 49 using NextInt(49) methods. 

import java.util.Random;

public class practical11 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumbers = new int[100];

        for (int i = 0; i < 100; i++) {
            randomNumbers[i] = random.nextInt(49) + 1;
        }

        System.out.println("The 100 random numbers are as follows:");
        for (int i = 0; i < 100; i++) {
            System.out.print(randomNumbers[i] + " ");
            if ( i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
