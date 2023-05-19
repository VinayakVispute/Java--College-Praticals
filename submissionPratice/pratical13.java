import java.util.Scanner;

public class pratical13{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Decimal Number : ");
        String str = myObj.nextLine();
        int indexOfDot = str.indexOf(".");
        if(indexOfDot==-1){
            System.out.println("Please Kindly enter Decima Number .");
        }else{
        System.out.println("Integer Parts is : "+ str.substring(0,indexOfDot));
        System.out.println("Fraction  Parts is : "+ str.substring(indexOfDot+1));
        }
    }
}