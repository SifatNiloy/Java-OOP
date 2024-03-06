
package midSolveFall22;
import java.util.Scanner;

public class largestResult {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int num1= input.nextInt();
		System.out.println("Enter 2nd number : ");
		float num2= input.nextFloat();
		System.out.println("Enter 3rd number : " );
		double num3= input.nextDouble();
		double result = (Math.pow(num1,(num2+num3))-100)/(num1*num2);
		System.out.printf("Result:%.2f\n",result);
		double largest=0;
		if(num1>num2 && num1>num3) {
			largest= num1;
		}
		if(num2>num1 && num2>num3) {
			largest= num2;
		}
		else {
			largest= num3;
		}
		System.out.printf("largest: %.2f", largest);
	}

}
