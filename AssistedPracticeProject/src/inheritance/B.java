package inheritance;

public class B extends C {

	public void day() {
		System.out.println("Tuesday");
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		b.day();
		b.date();
	}
}
