package inheritance;

public class A extends C {

	public void month() {
		System.out.println("June");
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		a.month();
		a.date();
	}
}
