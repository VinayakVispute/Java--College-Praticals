// Write a program that reads a number in meters,converts it to feet, and displays the result.
import java.util.Scanner;

public class pratical3 {
    public static void main(String[] args) {
        double numberInMeters;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a Number :(In Meters)");
        numberInMeters = myObj.nextDouble();
        double numberInfeet = numberInMeters * 3.281;
        System.out.printf("The Converstion is Follows:\n%f Meters => %f Feet",numberInMeters,numberInfeet);
    }
}