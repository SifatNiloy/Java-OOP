package extraProblems;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		int n= input.nextInt();
		boolean isPrime=true;
		if(n<=1) {
			isPrime= false;
		}
		else {
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					isPrime= false;
					break;
				}			
			}
		}
		if(isPrime) {
			System.out.println("Prime number ");
		}
		else {
			System.out.println("not prime");
		}
	}

}
