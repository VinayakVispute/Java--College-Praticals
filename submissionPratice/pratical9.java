import java.util.Scanner;

public class pratical9 {
    public static boolean isPalidrom(String str) {
        int strLength = str.length();
        for (int i = 0; i < strLength / 2; i++) {
            if (str.charAt(i) != str.charAt(strLength - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the String :");
        String str = myObj.nextLine();
        int strLength = str.length();
        if (isPalidrom(str)) {
            System.out.println("YES");
        } else {
            System.out.println("No");

        }
    }
}