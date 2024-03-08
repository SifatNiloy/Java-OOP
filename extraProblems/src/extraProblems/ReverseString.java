package extraProblems;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a string: ");
		String inputString= input.nextLine();
		System.out.println(inputString);
		StringBuilder reversed= new StringBuilder();
		for (int i=inputString.length()-1;i>=0;i--) {
			reversed.append(inputString.charAt(i));
		}
		
		System.out.println(reversed.toString());
		if(inputString.equals(reversed.toString())) {
			System.out.println("Palendrome");
		}
		else {
			System.out.println("Not palendrome");
		}
	}

}
