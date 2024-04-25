package finalSolve01;

public abstract class Person {
	private int id;
	public String name;
	
	//constructor
	public Person(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	//get method
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	//abstract method to get role
	public abstract String getRole() ;
}
