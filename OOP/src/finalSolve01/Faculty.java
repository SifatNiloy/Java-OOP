package finalSolve01;

public class Faculty extends Person {
	private int employeeId;
	private String department;
	
	//constructor
	public Faculty(int id, String name, int employeeId, String department) {
		super(id, name);
		this.employeeId= employeeId;
		this.department = department;
	}
	
	//override getRole method
	public String getRole() {
		return "Faculty";
	}
	
	//toString() method to display student information
	@Override
	public String toString() {
		return "id:"+getId()+" name: "+getName()+ " Employee ID:"+ employeeId+ " Department: "+department;
	}
}
