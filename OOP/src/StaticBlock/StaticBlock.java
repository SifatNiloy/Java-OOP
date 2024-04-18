package StaticBlock;

public class StaticBlock {
	static int id;
	static String name;
	//using static block to set their value
	
	static {
		id=101;
		name="sifat";
	}
	
	static void display() {
		System.out.println("id: "+id);
		System.out.println("name: "+ name);
	}
	// running the code in the same class, without creating another class
	public static void main(String[] args) {
		StaticBlock.display();
	}
}
