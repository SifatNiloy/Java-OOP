package Java_Basic;
import java.util.Scanner;

public class loop_task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = scan.nextInt();
		
		
		//System.out.println(1);
		//System.out.println(2);
		//System.out.println(3);
		int i;
		//print even numbers till nth term
		for(i=0; i<=num; i++)
		{
			if(i%2 == 0)
				System.out.println(i);
		}
		
		//print nth number of even numbers
		System.out.println("nth number of even numbers");
		for(i=0; i<num*2; i++)
		{
			if(i%2 == 0)
				System.out.print(i+" ");
		}
		
		//with different starting point in a different way
		int count =0;
		System.out.println("\nEnter the starting point");
		int start = scan.nextInt();
		for(i=start; count<num ; i++)
		{
			if(i%2 == 0) {
				System.out.print(i+" ");
				count++;
			}
				
		}
		scan.close();

	}

}
