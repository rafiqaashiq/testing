package coreJava;

public class TypeCasting {

	public static void main(String[] args) {
		
		// implicit conversion
		System.out.println("Implicit Type Casting");
		int num1 = 5;
		double num2 = num1;
		System.out.println(num2);
				
		// explicit conversion
		System.out.println("Explicit Type Casting");
		double num3 = 9.7;
		int num4 = (int)num3;
		System.out.println(num4);
	}
}
