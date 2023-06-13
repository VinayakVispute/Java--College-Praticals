import java.util.Scanner;
import java.lang.Math;

public class pratical2{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the Weight in Pounds :");
        double weightInPounds = myObj.nextDouble();
        System.out.print("Enter the Height in Inches :");
        double heightInInches = myObj.nextDouble();
        double weightInKg = weightInPounds* 0.45359237;
        double heightInMeters = heightInInches * 0.0254;
        double calculatedBMI = weightInKg/Math.pow(heightInMeters,2);
        System.out.println();
        System.out.println("The BMI is :"+calculatedBMI);


    }
}