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
	
	public static void main(String[] args) {
		StaticBlock.display();
	}
}
