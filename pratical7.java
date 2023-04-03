// Write a program to find length of string and print second half of the string.


import java.util.Scanner;

public class pratical7{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = myObj.nextLine();
        System.out.println("\n");
        int strLength = str.length();
        String secondHalfStr = "";
        /* Using For Loop
        for(int i = (strLength)/2;i<strLength;i++){
            secondHalfStr+=str.charAt(i);
        }
        System.out.println(secondHalfStr);
        */

        secondHalfStr = str.substring(strLength/2,strLength);
        System.out.println(secondHalfStr+);

    }   
}