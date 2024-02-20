package Java_Basic;
import java.util.Scanner;

public class Prime_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int i, flag = 0;
		
		int num = scan.nextInt();
		
		for(i=2 ; i<num ; i++)
		{
			if(num%i == 0)
			{
				//break;
				flag = 1;
			}
		}
		
		//if(i==num)
		//	System.out.println("Prime number");
		//else
		//	System.out.println("Not Prime");
		
		if(flag ==1)
			System.out.println("Not Prime");
		else
			System.out.println("Prime number");

	}

}
