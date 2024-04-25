package finalSolve01;

public class Main {

	public static void main(String[] args) {
		// creating array of person objects
		Person[] people = new Person[4];
		
		// Initializing students
        people[0] = new Student(1, "John Doe", 2020, "Computer Science");
        people[1] = new Student(2, "Jane Smith", 2019, "Physics");
        
        // Initializing faculty members
        people[2] = new Faculty(101, "Dr. Smith", 1001, "Computer Science");
        people[3] = new Faculty(102, "Dr. Johnson", 1002, "Physics");
        
        // Iterating through the array and printing role and information of each person
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println("Role: " + person.getRole());
            System.out.println(person);
            System.out.println();
        }
	}

}
