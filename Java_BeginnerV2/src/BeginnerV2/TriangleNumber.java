package BeginnerV2;
import java.util.Scanner;
public class TriangleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		int i, j, k;
		
		for(j=1; j<=n; j++)
		{
			for(k=n-j; k>=1 ; k--)
			{
				System.out.print("-");
			}
			
			for(i=1; i<=j; i++)
			{
				System.out.print(j+"-");
			}
			System.out.println();
		}
	}

}
