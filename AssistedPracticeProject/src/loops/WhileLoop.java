package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		int PINinDB = 1234;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your ATM PIN : ");
		int enteredPIN = scanner.nextInt();
		
		while(enteredPIN != PINinDB) {
			System.out.println("The entered ATM PIN incorrect. Please try again...");
			enteredPIN = scanner.nextInt();
		}
		
		System.out.println("Welcome to AZee Bank");
	}
}
