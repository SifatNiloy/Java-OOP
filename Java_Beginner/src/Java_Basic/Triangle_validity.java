import java.util.Scanner;

public class Triangle_validity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three sides of Triangle");
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		
		if(a+b>c && a+c>b && b+c>a)
		{
			System.out.println("Valid Triangle");
		}
		else
		{
			System.out.println("InValid Triangle!!!!");
		}

	}

}
