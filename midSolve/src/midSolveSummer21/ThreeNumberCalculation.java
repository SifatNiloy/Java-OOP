package midSolveSummer21;

import java.util.Scanner;

public class ThreeNumberCalculation {

	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		System.out.println("Enter a integer number: ");
		int num1= input.nextInt();
		
		System.out.println("Enter a float number: ");
		float num2= input.nextFloat();
		
		System.out.println("Enter a double type number: ");
		double num3= input.nextDouble();
		System.out.println("num1 :"+num1+"\nnum2 :"+ num2+ "\nnum3 :"+ num3);
		double result =(Math.pow(num1,(num2+num3))-100)/(num1*num2);
		System.out.println("result : " +result);
		
	}

}
