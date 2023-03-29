// Write a program that prompts the user to enter three integers and display the maximum number among these numbers.
import java.util.Scanner;

public class pratical5{
    public static void main(String[] agrs){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int num1 = myObj.nextInt();
        System.out.print("Enter the second Number: ");
        int num2 = myObj.nextInt();
        System.out.print("Enter the third Number: ");
        int num3 = myObj.nextInt();
        int maxNumber;
        if(num1>=num2){
            if(num1>num3){
                maxNumber = num1;
            }else{
                maxNumber = num3;
            }
        }else{
            if(num2>num3){
                maxNumber = num2;
            }else{
                maxNumber = num3;
            }
        }
        System.out.println("The Maximum number is : "+ maxNumber);
    }

}