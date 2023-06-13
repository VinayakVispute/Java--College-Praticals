import java.util.Scanner;

public class Pratical5 {
    public static void main(String[] args) {

        int num[] = new int[3];
        Scanner myObj = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter Num %d : ", i + 1);
            num[i] = myObj.nextInt();
        }

        if(num[0]> num[1] && num[0] > num[2]){
            System.out.printf("The Greatest Number is %d",num[0]);
        }else if(num[1]> num[0] && num[1] > num[2]){
            System.out.printf("The Greatest Number is %d",num[1]);
        }else{
            System.out.printf("The Greatest Number is %d",num[0]);
        }

    }
}