package Inheritance;

public class Faculty extends Person{
	
	public String designation;
	
	public Faculty(String name, int id, String email, String Des)
	{
		super(name, id, email);
		this.designation = Des;
	}
	
}
