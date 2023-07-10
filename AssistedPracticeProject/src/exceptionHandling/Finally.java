package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter 1st number : ");
			int num1 = scanner.nextInt();
			
			System.out.println("Enter 2nd number : ");
			int num2 = scanner.nextInt();
			
			System.out.println("Division of numbers : " + (num1/num2));
		}
		
		catch(ArithmeticException e) {
			System.out.println("Please do not enter zero for denominator value");
		}
		
		catch(InputMismatchException e) {
			System.out.println("Only integer values are allowed");
		}
		
		catch(Exception e) {
			// actions to be taken in case an exception occurs
			System.out.println("Please enter a valid input");
		}
		
		finally {
			System.out.println("Hello");
		}
	}
}
