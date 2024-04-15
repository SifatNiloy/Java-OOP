package basic;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher1;  //object declared
		teacher1= new Teacher();  //object created
		teacher1.setInformation("Anisul Islam", "Male", 24358742);
		teacher1.displayInformation();
		
		Teacher teacher2= new Teacher(); //object created
		teacher2.setInformation("Sifat","Male", 49590);
		teacher2.displayInformation();
	}

}
