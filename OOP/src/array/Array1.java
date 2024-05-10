package array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum=0;
		
		double[] number= new double[5];
		System.out.println("please enter 5 numbers");
		for (int i=0; i<number.length; i++) {
			number[i]= input.nextDouble();
			sum= sum+ number[i];
		}
		System.out.println("the sum is: "+ sum);
		
		double max=number[0];
		for(int i=0; i<number.length ; i++) {
			if(number[i]>max) {
				max= number[i];
			}
		}
		System.out.println("max number is: "+ max);
		
		double min=number[0];
		for(int i=0; i<number.length ; i++) {
			if(number[i]<min) {
				min= number[i];
			}
		}
		System.out.println("min number is: "+ min);
		
		String[] names= {"Anis", "Shohidul", "Sojib"};
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
	}

}
