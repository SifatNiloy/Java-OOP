package finalSolve02;

public class LabAssistant extends TeachingAssistant{
	double hour;
	double hourlyPay;
	LabAssistant(String name, int id,double hour ,double hourlyPay){
		super(name, id);
		this.hour= hour;
		this.hourlyPay= hourlyPay;
	}
	@Override
	public double printEarningsLabAssistant() {
			return hour*hourlyPay;
	}
}
