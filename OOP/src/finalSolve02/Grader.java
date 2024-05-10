package finalSolve02;

public class Grader extends TeachingAssistant{
	int count;
	double payPerAssignment;
	Grader(String name, int id,int count,double payPerAssignment){
		super(name, id);
		this.count= count;
		this.payPerAssignment= payPerAssignment;
	}
	@Override
	public double printEarningsGrader() {
		return count*payPerAssignment;
	}
}
