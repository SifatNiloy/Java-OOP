package callBy;

public class CallByValueTest {

	public static void main(String[] args) {
		CallByValue ob= new CallByValue();
		int x=10;  //primitive data
		System.out.println("x before change: "+x);
		
		ob.change(x=50);
		System.out.println("x after change: "+x);

	}

}
