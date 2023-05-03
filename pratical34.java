import java.util.ArrayList;
import java.util.Date;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        Loan loan = new Loan(1000, 5.5, 2);
        Date date = new Date();
        String str = "Hello, World!";
        Circle circle = new Circle(5.0);

        list.add(loan);
        list.add(date);
        list.add(str);
        list.add(circle);

        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }
}

class Loan {
    private double amount;
    private double interestRate;
    private int years;

    public Loan(double amount, double interestRate, int years) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.years = years;
    }

    @Override
    public String toString() {
        return "Loan amount: " + amount + ", interest rate: " + interestRate + ", years: " + years;
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle radius: " + radius + ", area: " + getArea();
    }
}
