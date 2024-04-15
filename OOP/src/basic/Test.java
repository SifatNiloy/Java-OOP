package basic;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher1;  //object declared
		teacher1= new Teacher();  //object created
		teacher1.name= "Anisul Islam";
		teacher1.gender="Male";
		teacher1.phone=2987435;
		
		System.out.println(teacher1.name+"\n"+teacher1.gender+"\n"+teacher1.phone);
		
		Teacher teacher2= new Teacher(); //object created
		teacher1.name= "sifat";
		teacher1.gender="Male";
		teacher1.phone=1684345;
		
		System.out.println(teacher1.name+"\n"+teacher1.gender+"\n"+teacher1.phone);
	}

}
