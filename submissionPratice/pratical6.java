import java.util.Scanner;

public class pratical6{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("ENter a Character : ");
        char character = myObj.next().charAt(0);

        if(character == 'A' ||character == 'E' ||character == 'I' ||character == 'O' ||character == 'U' || character == 'a' ||character == 'e' ||character == 'i' ||character == 'o' ||character == 'u'){
            System.out.println("The Character is Vowel");
        }else{
            System.out.println("The Character is Not Vowel");
        }
    }
}