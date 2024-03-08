package extraProblems;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("please enter a number : ");
		int n= input.nextInt();
		int sum=0;
		//convert the number to string
		String numberString= Integer.toString(n);
		for (int i=0; i<numberString.length();i++) {
			char digitChar= numberString.charAt(i);
//			System.out.println(digitChar);
			int digit= Character.getNumericValue(digitChar);
			sum= sum+digit;
		}
		System.out.println(sum);

	}

}
