package exceptionHandling;

import java.util.Scanner;

public class ThrowThrows {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your age : ");
		int age = scanner.nextInt();
		
		if(age<18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("eligible to vote");
	}
}
