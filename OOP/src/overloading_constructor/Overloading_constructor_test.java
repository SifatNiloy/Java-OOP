package overloading_constructor;

public class Overloading_constructor_test {

	public static void main(String[] args) {
		Teacher teacher1= new Teacher();
		
		Teacher teacher2= new Teacher("sifat","male");
		teacher2.displayInformation();
		
		Teacher teacher3= new Teacher("sifat", "male", 94237);
		teacher3.displayInformation();

	}

}
