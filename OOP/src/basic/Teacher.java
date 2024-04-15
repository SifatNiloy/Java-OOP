package basic;

public class Teacher {

		String name, gender;
		int phone;
		
		void setInformation(String n, String m, int ph) {
			name = n;
			gender= m;
			phone= ph;
		}
		void displayInformation() {
			System.out.println(name+"\n"+gender+"\n"+phone);
		}

}
