import java.util.Scanner;
public class Even_odd_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number to check even or odd");
		int num = scan.nextInt();
		
		if(num >= 0)
		{
			if(num%2 == 0) {
				System.out.println("This is an EVEN number");
			}
			else
				System.out.println("This is an ODD number");
		}
		else
			System.out.println("Inavlid Input!!");
		
		 

	}

}
