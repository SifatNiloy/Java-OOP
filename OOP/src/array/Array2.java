package array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
//		String[] weekdays= new String[7];
//		weekdays[0]="Saturday";
//		weekdays[1]="Sunday";
//		weekdays[2]="Monday";
//		weekdays[3]="Tuesday";
//		weekdays[4]="Wednesday";
//		weekdays[5]="Thursday";
//		weekdays[6]="Friday";
		
		String[] weekdays= {"saturday", "sunday", "monday", "tuesday", "wednesday", "thursday", "friday"};
		
		Scanner input= new Scanner(System.in);
		System.out.println("please enter a value from 1 to 7");
		int day= input.nextInt()-1;
		
		System.out.println(weekdays[day]);

	}

}
