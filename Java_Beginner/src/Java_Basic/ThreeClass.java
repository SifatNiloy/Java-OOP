package Java_Basic;

import java.util.Scanner;

public class ThreeClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Inflation Rate: ");
        double inflationRate = scanner.nextDouble();
        System.out.print("Enter Interest: ");
        double interest = scanner.nextDouble();

        Y y = new Y(inflationRate, interest);

        System.out.println("Adjusted Inflation Rate (2% less): " + y.getAdjustedInflationRate());
        System.out.println("Adjusted Interest (2% more): " + y.getAdjustedInterest());

        System.out.print("Enter x and y for Z's first method (separated by space): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Result of Z's first method: " + Z.calculate(x1, y1));

        System.out.print("Enter a number for Z's second method: ");
        double x2 = scanner.nextDouble();
        System.out.println("Square of the number: " + Z.square(x2));
    }
}

class Y {
    private double inflationRate;
    private double interest;
    protected double protectedValue = 10.0; // You can set an appropriate value here

    public Y(double inflationRate, double interest) {
        this.inflationRate = inflationRate;
        this.interest = interest;
    }

    public double getAdjustedInflationRate() {
        return inflationRate * 0.98; // Apply 2% reduction
    }

    public double getAdjustedInterest() {
        return interest * 1.02; // Apply 2% increase
    }
}

class Z {
    public static double calculate(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return x * (x / (y / 2.5)) / 2;
    }

    public static double square(double x) {
        return x * x;
    }
}
