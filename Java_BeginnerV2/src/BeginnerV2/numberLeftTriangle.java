package BeginnerV2;
import java.util.Scanner;
public class numberLeftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= input.nextInt();
		for(i=0; i<=n;i++) {
			for(k=0;k<i;k++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}

	}

}
