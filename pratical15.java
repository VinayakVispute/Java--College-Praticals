import java.util.Scanner;

public class pratical15{
    public static void gcd(int num1,int num2){
        boolean flag = false;
        int temp;
        if(num1>num2){
            temp = num2;
        }else{
            temp  = num1;
        }

        for(int j=temp;j>1;j--){
            if(num1%j==0 && num2%j==0){
                System.out.println("GDC : "+j);
                flag=true;
                return;
            }
        }
        if(flag==false) {
            System.out.println("GCD: 1");
        }
    }
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter 2 Number Respectlively : ");
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();

        gcd(num1,num2);
    }
}