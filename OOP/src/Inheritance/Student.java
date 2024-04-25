package Inheritance;

public class Student extends Person{
	
	public float cgpa;
	public int[] marks_s;
	
	public Student(String name, int id, String email, float cgpa, int[] marks)
	{
		super(name, id, email);
		this.cgpa = cgpa;
		this.marks_s = marks;
	}
	
	public boolean cgpaCheck()
	{
		if(cgpa > 3.5)
			return true;
		
		return false;
	}
	

	public boolean AgeCheck(int age)
	{
		if(this.age >= 20)
			return true;
		
		return false;
	}
	
	//overridden method
	public void ShowDetails()
	{
		super.ShowDetails();
		System.out.println(" cgpa: "+cgpa);
	}

	
}
