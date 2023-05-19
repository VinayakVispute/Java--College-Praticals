import java.util.Scanner;

public class pratical15{
    public static void gcd(int num1,int num2) {
        boolean flag = false;
        int temp;
        if(num1>num2){
            temp=num2;
        }else{
            temp=num1;
        }

        for(int i = temp;i>1;i--){
            if(num1%i==0 && num2%i==0){
                System.out.println("GDC : "+i);
                flag=true;
                return;
            }
        }
        if(flag==false) {
            System.out.println("GCD: 1");
        }
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter 2 Number Respectlively : ");
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();

        gcd(num1,num2);
    }
}