package midSolveSummer23;

import java.util.Scanner;

public class MangoCosting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter mango numbers: ");
		int mango= input.nextInt();
		double price=12.5;
		double discount=0;
		double vat= 0.12;
		double delivery=70.0;
		if(mango>=10 && mango <20) {
			discount= 0.15;
		}
		if(mango>=20) {
			discount= 0.25;
		}
		double discountedPrice=(mango*price)-(mango*price)*discount;
		double taxedPrice= discountedPrice+ discountedPrice*vat;
		double totalPrice= taxedPrice+ delivery;
		System.out.println("payable total: "+ totalPrice);
		

	}

}
