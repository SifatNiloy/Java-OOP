package basic;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher1;  //object declared
		teacher1= new Teacher();  //object created
		teacher1.name= "Anisul Islam";
		teacher1.gender="Male";
		teacher1.phone=2987435;
		teacher1.displayInformation();
		
		Teacher teacher2= new Teacher(); //object created
		teacher2.name= "sifat";
		teacher2.gender="Male";
		teacher2.phone=1684345;
		teacher2.displayInformation();
	}

}
