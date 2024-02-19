package Java_Basic;

import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter any letter: ");
		char ch= input.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("consonent");
		}
	}

}
