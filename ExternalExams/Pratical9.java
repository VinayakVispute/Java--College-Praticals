import java.util.Scanner;

public class Pratical9 {
    static boolean isPalidrome(String str) {
        String reverseString = "";

        for(int i = str.length()-1;i>=0;i--){
            reverseString=reverseString+str.charAt(i);
        }

        if(str.equals(reverseString)){
            return true;
        }
            return false;
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = myObj.nextLine();
        System.out.printf("\n The %s is %s",str,(isPalidrome(str)?"Palidrome":"Not a Palidrome").toString());
        
    }
}