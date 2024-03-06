package midSolveSummer23;
import java.util.Scanner;
public class Calculate {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int num1= input.nextInt();
		System.out.println("Enter a float number: ");
		float num2= input.nextFloat();
		System.out.println("Enter an double number: ");
		double num3= input.nextDouble();
		double result= calculate(num1, num2, num3);
		System.out.println("Result: " + result);

	}
	public static double calculate(int num1, float num2, double num3) {
		return (num1*num2)* Math.pow(num1,(num2+num3))-125.5;
	}

}
