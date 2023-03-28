//Write a program to count the number of words that  start with capital letters 
import java.util.Scanner;
import java.lang.String;

public class pratical8{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the Sentence :");
        String str = myObj.nextLine();
        String[] words = str.split(" ");
        int countCapitalChar = 0;
        for(int i = 0;i<words.length;i++){
            char firstChar = words[i].charAt(0);
            boolean isUpperChar = Character.isUpperCase(firstChar);
            if(isUpperChar){
                countCapitalChar++;
            }
        }
        System.out.println("Total No. of Uppercase Character is: "+countCapitalChar);
    }
}