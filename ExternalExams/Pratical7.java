import java.util.Scanner;

public class Pratical7 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the Character : ");
        String str = myObj.next();
        System.out.println("\n");
        int strLength = str.length();
        String secondString = "";
        for (int i = strLength / 2; i < strLength; i++) {
            secondString = secondString + str.charAt(i);
        }
        System.out.println("The Half String : " + secondString);
    }
    // secondHalfStr = str.substring(strLength/2,strLength);
}