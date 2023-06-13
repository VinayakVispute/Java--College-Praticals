import java.util.Scanner;
import java.lang.String;

public class Pratical8 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter:");
        String str = myObj.nextLine();
        String[] words = str.split(" ");
        int count = 0;
        for(int i=0;i<words.length;i++){
            char firstChar = words[i].charAt(0);
            boolean isUpperCaseChar = Character.isUpperCase(firstChar);
            if(isUpperCaseChar){
                count=count+1;
            }
        }
        System.out.println(str);
        System.out.println();
        System.out.printf("There are %d number of Character starting with UpperCase Char",count);
     }
}