// Write a program to find that given number or string is palindrome or not
import java.util.Scanner;

public class pratical9{
    static boolean isPalidrome(String str){
        String reverseString = "";

        for(int i = str.length()-1;i>=0;i--){
            reverseString +=str.charAt(i);
        }

        if(str.equals(reverseString)){
            return true;
        }
        return false;

    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter String or Number : ");
        String str = myObj.nextLine();
        boolean checkPalidrome = isPalidrome(str);


        if(checkPalidrome){
            System.out.println(str+" is a Palidrome");
        } else{
            System.out.println(str+" is a Not Palidrome");
        }

    }
}