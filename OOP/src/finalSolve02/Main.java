package finalSolve02;

public class Main {

	public static void main(String[] args) {
//		TeachingAssistant g1=new Grader("Anis", 23, 20, 15);
//		g1.printEarnings();
//		System.out.println(g1.printEarningsGrader());
//		
//		LabAssistant l1=new LabAssistant("Anisul", 12, 25, 50);
//		l1.printEarnings();
//		System.out.println(l1.printEarningsLabAssistant());
		
		//using array and loops
		// Creating Graders
        Grader[] graders = new Grader[2];
        graders[0] = new Grader("Anis", 23, 20, 15);
        graders[1] = new Grader("John", 24, 15, 12);

        // Printing earnings of Graders
        for (int i = 0; i < graders.length; i++) {
            graders[i].printEarnings();
            System.out.println(graders[i].printEarningsGrader());
        }

        // Creating LabAssistants
        LabAssistant[] labAssistants = new LabAssistant[2];
        labAssistants[0] = new LabAssistant("Anisul", 12, 25, 50);
        labAssistants[1] = new LabAssistant("Jane", 13, 30, 45);

        // Printing earnings of LabAssistants
        for (int i = 0; i < labAssistants.length; i++) {
            labAssistants[i].printEarnings();
            System.out.println(labAssistants[i].printEarningsLabAssistant());
        }

	}

}
