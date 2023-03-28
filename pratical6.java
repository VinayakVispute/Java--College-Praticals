
// Write a program that prompts the user to enter a letter and check whether a letter is a vowel or consonant.
import java.util.Scanner;

public class pratical6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char str = myObj.next().charAt(0);

        boolean isVowels = (str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u'|| str == 'A' || str == 'E' || str == 'I' || str == 'O' || str == 'U');
        if(isVowels){
            System.out.println("The Character \""+str+"\" is Vowel");
        }else{
            System.out.println("The Character \""+str+"\" is Consonant");
        }
    }
}