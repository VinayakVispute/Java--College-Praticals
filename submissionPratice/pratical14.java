import java.util.Scanner;

public class pratical14{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = myObj.nextInt();
        int temp = num;
        int smallestFactor = 2;
        System.out.println("Factorser of "+num+" are as follows :");
        while(temp>1){
            if(temp%smallestFactor==0){
                System.out.print(smallestFactor+", ");
                temp/=smallestFactor;
            }else{
                smallestFactor++;
            }
        }
        System.out.println();

    }
}