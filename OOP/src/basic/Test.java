package basic;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher1;  //object declared
		teacher1= new Teacher("Anisul Islam", "Male", 24358742);  //object initialized inside constructor
		teacher1.displayInformation();
		
		Teacher teacher2= new Teacher("Sifat","Male", 49590); //object initialized inside constructor method
		teacher2.displayInformation();
		
		Teacher teacher3= new Teacher();
//		teacher3.displayInformation();
	}

}
