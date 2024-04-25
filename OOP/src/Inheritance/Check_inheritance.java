package Inheritance;
import java.util.*;

public class Check_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = new int[10];
		
		Student s = new Student("rakib", 123, "s@gmail.com", 3.8f, marks);
		Student[] stu_info = new Student[10];
		stu_info[0] = s;
	
		Scanner scan = new Scanner(System.in);
		
		int marks1 = 10;
		int marks2 = 20;
		int marks3 = 5;
		
		//int[] marks = new int[10];
		marks[0] = 10;
		marks[1] = 20;
		marks[2] = 5;
		
		int i;
		for(i=0; i<5; i++)
		{
			marks[i] = scan.nextInt();
		}
		
		for(i=0; i<5; i++)
		{
			System.out.println("marks["+i+"]: "+marks[i]);
		}
		
		
		Person p = new Person("abc", 159, "a@gmail.com");
		
		Person s1 = new Student("sgss", 753, "e@gmail.com", 2.5f, marks);
		Person f1 = new Faculty("sgss", 753, "e@gmail.com", "Professor");
		
		if(s1 instanceof Student)
		{
			
		}
		
		s.name = "sakib";
		s.age = 19;
		s.cgpa = 3.2f;
		
		s.ShowDetails();
		
		if(s.cgpaCheck())
			System.out.println(" cgpa is greater than 3.5 ");
		else
			System.out.println(" cgpa is less than 3.5 ");
		
		
		if(s.AgeCheck())
			System.out.println(" okay");
		else
			System.out.println(" not okay!");

	}

}
