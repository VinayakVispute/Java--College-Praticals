import java.util.Scanner;
import java.lang.String;

public class pratical8 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = myObj.nextLine();
        String[] words = str.split(" ");
        int capitalCounter = 0;

        for(int i=0;i<words.length;i++){
            boolean isUpperCharacter = Character.isUpperCase(words[i].charAt(0));

            if(isUpperCharacter){
                capitalCounter++;
            }
        }
        System.out.println("The Number of characters are : "+capitalCounter);
    }
}