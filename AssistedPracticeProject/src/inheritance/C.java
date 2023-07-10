package inheritance;

public class C extends D {

	public void year() {
		System.out.println("2023");
	}
	
	public static void main(String[] args) {
		
		C c = new C();
		c.year();
		c.date();
	}
}
