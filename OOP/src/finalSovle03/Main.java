package finalSovle03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num1 = scanner.nextInt();

        // Show menu
        System.out.println("Menu:");
        System.out.println("1) Find how many digits in num1 are greater than 5.");
        System.out.println("2) Convert each digit from num1 into its word form.");
        System.out.println("3) Find out how many digits are even in num1.");
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();

        if (option == 1) {
            DigitGreaterThanFive digitGreaterThanFive = new DigitGreaterThanFive();
            int count1 = digitGreaterThanFive.countDigitsGreaterThanFive(num1);
            System.out.println("Number of digits greater than 5: " + count1);
        } else if (option == 2) {
            ConvertToWordForm convertToWordForm = new ConvertToWordForm();
            String wordForm = convertToWordForm.convertToWordForm(num1);
            System.out.println("Word form of the number: " + wordForm);
        } else if (option == 3) {
            EvenDigits evenDigits = new EvenDigits();
            int count2 = evenDigits.countEvenDigits(num1);
            System.out.println("Number of even digits: " + count2);
        } else {
            System.out.println("Invalid option!");
        }

        scanner.close();
    }
}

