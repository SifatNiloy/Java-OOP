package finalSolve01;

public class Student extends Person {
	private int enrollmentYear;
	private String major;
	
	//constructor
	public Student(int id, String name, int enrollmentYear, String major) {
		super(id, name);
		this.enrollmentYear= enrollmentYear;
		this.major = major;
	}
	
	//override getrole method
	public String getRole() {
		return "Student";
	}
	
	//toString() method to display student information
	@Override
	public String toString() {
		return "id:"+getId()+" name: "+getName()+ " enrollment year"+ enrollmentYear+ " major : "+ major;
	}
}
