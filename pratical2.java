/*Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters. Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters */
import java.util.Scanner;

public class pratical2 {
    public static void main (String[] args){
        float weight,height;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the Weight:(In Pounds)");
        weight = myObj.nextFloat();
        weight *= 0.45359237;
        System.out.println("Enter Height:(In Inches)");
        height = myObj.nextFloat();
        height *=0.0254;
        float UserBMI = weight/(height * height);
        System.out.println("The BMI of the User is : "+UserBMI+" kilogram/meter squared");

    }
}