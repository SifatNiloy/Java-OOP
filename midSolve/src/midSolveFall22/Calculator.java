package midSolveFall22;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		float n1= input.nextFloat();
		System.out.println("Enter the second number: ");
		float n2 = input.nextFloat();
		System.out.println("Enter the choice: ");
		int choice= input.nextInt();
		if(choice==1) {
			System.out.println(n1+n2);
		}
		if(choice==2) {
			System.out.println(n1-n2);
		}
		if(choice==3) {
			System.out.println(n1*n2);
		}
		if(choice==4) {
			System.out.println(n1/n2);
		}
		if(choice==5) {
			System.out.println(n1%n2);
		}
		if(choice==6) {
			System.out.println((n1+n2)/2);
		}
		
		

	}

}
