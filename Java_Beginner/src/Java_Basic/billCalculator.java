package Java_Basic;
import java.util.Scanner;
public class billCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quantity;
		System.out.print("Enter the quantity:");
		quantity = input.nextInt();
		boolean hd;
		System.out.print("Home delivery (true/false):");
		hd = input.nextBoolean();
		double tip;
		System.out.print("Enter tip amount: ");
		tip = input.nextDouble();
		double bill;
		bill = quantity * 12.5;
		if(quantity>=1 && quantity<=9) {
			bill = bill * 0.95;
		}
		else if(quantity>=10 && quantity<=19) {
			bill = bill * 0.90;
		}
		else if(quantity>=20) {
			bill = bill * 0.85;
		}
		bill = bill * 1.2; // TAX
		if(hd) {
			bill = bill + 40.0;
		}
		bill = bill + tip;
		System.out.print(bill);
		
	}
}