package basic;

public class Teacher {

		String name, gender;
		int phone;
		
		Teacher(){
			System.out.println("no value");
		}
		Teacher(String n, String g, int p) {
			name = n;
			gender= g;
			phone= p;
		}
		void displayInformation() {
			System.out.println(name+"\n"+gender+"\n"+phone);
		}

}
