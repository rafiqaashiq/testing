package exceptionHandling;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter 1st number : ");
			int num1 = scanner.nextInt();
			
			System.out.println("Enter 2nd number : ");
			int num2 = scanner.nextInt();
			
			System.out.println("Division of numbers : " + (num1/num2));
		}
		
		catch(Exception e) {
			System.out.println("Please enter a valid input");
		}
	}
}
