import java.util.Scanner;

public class pratical7{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = myObj.nextLine();
        int stringLength = str.length();
        for(int i = stringLength/2;i<stringLength;i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}