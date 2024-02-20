package Java_Basic;
import java.util.Scanner;

public class DPSPlanCalculator{
	public static void main(String[] args) {
		double amount=0,year=0, IR=1,bonus=0, tax=0;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the amount: ");
		amount= input.nextDouble();
		System.out.println("Enter year number: ");
		year= input.nextDouble();
//		System.out.println(amount+" "+year);
		
		if (amount==500) {
			bonus=2000;
			tax=0.05;
			if(year<3) {
				IR=0;
				bonus=0;
				tax=0.05;
			}
			if(year==3|| year ==4) {
				IR= 0.07;
			}
			if(year==5|| year ==6) {
				IR= 0.08;
			}
			if(year>=7) {
				IR= 0.09;
			}
			
		}
		else if (amount==1000) {
			bonus=4500;
			tax=0.07;
			if(year<3) {
				IR=0;
				bonus=0;
				tax=0.05;
			}
			if(year==3|| year ==4) {
				IR= 0.08;
			}
			if(year==5|| year ==6) {
				IR= 0.09;
			}
			if(year>=7) {
				IR= 0.10;
			}
			
		}
		else if (amount==2000) {
			bonus=10000;
			tax=0.07;
			if(year<3) {
				IR=0;
				bonus=0;
				tax=0.05;
			}
			if(year==3|| year ==4) {
				IR= 0.09;
			}
			if(year==5|| year ==6) {
				IR= 0.10;
			}
			if(year>=7) {
				IR= 0.11;
			}
			
		}
		else if (amount==5000) {
			bonus=30000;
			tax=0.09;
			if(year<3) {
				IR=0;
				bonus=0;
				tax=0.05;
			}
			if(year==3|| year ==4) {
				IR= 0.10;
			}
			if(year==5|| year ==6) {
				IR= 0.11;
			}
			if(year>=7) {
				IR= 0.12;
			}
			
		}
		System.out.println("IR: "+IR+"  bonus: "+bonus+" tax: "+tax);
		double totalAmount= amount*(year*12);
		double amountWithInterestBonus= (totalAmount + (totalAmount*IR) +bonus);
		double finalBalance= amountWithInterestBonus -amountWithInterestBonus *tax;
		System.out.println("Final balance is : "+totalAmount +"\n"+amountWithInterestBonus+"\n"+ finalBalance);
	}
}