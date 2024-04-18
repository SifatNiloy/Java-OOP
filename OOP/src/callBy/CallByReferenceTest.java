package callBy;

public class CallByReferenceTest {

	public static void main(String[] args) {
		CallByReference r1= new CallByReference();
		r1.name= "sifat";
		System.out.println("Before calling,"+ r1);
		
		r1.change(r1);
		System.out.println("After calling,"+ r1);
	}

}
