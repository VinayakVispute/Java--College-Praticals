import java.util.Scanner;

public class Pratical10 {
    public static void main(String args[]) {
        String str = "STREAM";

        int strLength = str.length();

        for (int i = 0; i < strLength; i++) {
            for (int j = strLength - 1; i > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.println(str.charAt(i));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}