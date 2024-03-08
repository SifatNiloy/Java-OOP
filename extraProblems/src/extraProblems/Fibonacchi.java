package extraProblems;

import java.util.Scanner;

public class Fibonacchi {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n= input.nextInt();
		int fib=0;
		int nextfib=1;
		for (int i=1; i<=n; i++) {
			System.out.print(fib+" ");
			//next fib
			int temp= fib+nextfib; //13
			fib= nextfib; //1   //0,1,1,2,3,5,8
			nextfib= temp; //13
			
		}

	}

}
