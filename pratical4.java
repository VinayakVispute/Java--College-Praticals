// Write a program to check the given number is Prime or not

import java.util.Scanner;


public class pratical4{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the Number(in Integer) : ");
        int num = myObj.nextInt();
        boolean isPrime = true;
        for(int i = 2;i<num;i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num+" is a Prime Number");
            return ;
        } else {
            System.out.println(num+" is a Prime Not a Number");
        }


    }
}