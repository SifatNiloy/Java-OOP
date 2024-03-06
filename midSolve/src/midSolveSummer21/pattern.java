package midSolveSummer21;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		int i, j , k;
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int n= input.nextInt();
		for (i=n+1; i>1; i--) {
			for (k=i-1;k<=n;k++) {
				System.out.print(k);
			}
			System.out.println("");
		}
		
	}
}
