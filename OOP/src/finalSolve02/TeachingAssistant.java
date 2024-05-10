package finalSolve02;

public class TeachingAssistant {
	String name;
	int id;
	TeachingAssistant(String name, int id){
		this.name= name;
		this.id= id;
	}
	void printEarnings(){
		System.out.println("name:"+name+ "  id:"+ id);
	}
	public double printEarningsGrader() {
		return 0;
		
	}
	public double printEarningsLabAssistant() {
		return 0;
	}
}
