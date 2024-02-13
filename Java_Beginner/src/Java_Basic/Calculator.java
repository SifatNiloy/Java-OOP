package Java_Basic;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;

        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum);
        System.out.println("The subtraction of " + firstNumber + " and " + secondNumber + " is: " + subtraction);
        System.out.println("The multiplication of " + firstNumber + " and " + secondNumber + " is: " + multiplication);
	}

}
