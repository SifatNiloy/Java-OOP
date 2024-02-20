import java.util.Scanner;
public class nested_loop_task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int i, j, k;
		
		
		//pattern 1
		for(j=1; j<=n; j++)
		{
			for(i=1; i<=n; i++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//pattern 2
		for(j=1; j<=n; j++)
		{
			for(i=1; i<=j; i++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//pattern 3
		for(j=1; j<=n; j++)
		{
			for(k=n-j; k>=1 ; k--)
			{
				System.out.print(" ");
			}
			
			for(i=1; i<=j; i++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		scan.close();

	}

}
