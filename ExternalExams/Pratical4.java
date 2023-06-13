import java.util.Scanner;


public class pratical4{
    public static boolean isPrime(int num){
        for(int i = 2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = myObj.nextInt();
        System.out.printf("The Number %d is "+(isPrime(num)?"Prime":"Not a Prime").toString()+"\n",num);
    }
}