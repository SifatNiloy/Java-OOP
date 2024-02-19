package Java_Basic;
import java.util.Scanner;
public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, large;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		num1= input.nextInt();
		num2= input.nextInt();
		large= (num1>num2)? num1: num2;
		System.out.print("largest number is : "+ large);

	}

}
