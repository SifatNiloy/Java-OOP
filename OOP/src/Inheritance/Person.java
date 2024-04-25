package Inheritance;


public class Person {
	
	private int id;
	public String name;
	public String email;
	public int age;
	public String gender;
	
	public Person(String name, int id, String email)
	{
		this.name = name;
		this.id = id;
		this.email = email;
	}
	
	public void ShowDetails()
	{
		System.out.println("Person name is "+this.name+" ID: "+this.id
				+" email: "+this.email+" Age: "+this.age);
		
	}
	
	public boolean AgeCheck()
	{
		if(this.age >= 18)
			return true;
		
		return false;
	}

}
