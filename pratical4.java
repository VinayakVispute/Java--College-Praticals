import java.util.Scanner;

// Write a program to check the given number is Prime or not

import java.util.Scanner;


public class pratical4{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in)

        System.out.println("Enter the Number:(Integer)");
        int num = myObj.nextInt();
        boolean isPrime = true;
        for(int i = 2;i<num;i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }


    }
}