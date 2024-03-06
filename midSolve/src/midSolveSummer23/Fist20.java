package midSolveSummer23;

import java.util.Scanner;

public class Fist20 {

	public static void main(String[] args) {
		int n1=0, n2=1, n3;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= input.nextInt();
		System.out.print(n1+" "+ n2);
		for (int i=0; i<=n; i++) {	
			n3=n2*2+n1;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
	}

}
