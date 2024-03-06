package midSolveSummer21;

import java.util.Scanner;

public class pineApple {

	public static void main(String[] args) {
		double tax = 0.15;
		double discount =0;
		double delivery= 50.0;
		double pineapplePrice= 52.5;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of pineapple: ");
		int n= input.nextInt();
		if(n>=5 && n<10) {
			discount=0.1;
		}
		if(n>=10) {
			discount=0.2;
		}
		double price= (pineapplePrice*n-pineapplePrice*n*discount)+((pineapplePrice*n-pineapplePrice*n*discount)*tax)+ delivery;
		System.out.println("payable amount: "+ price);

	}

}
