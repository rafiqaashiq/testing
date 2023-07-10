package coreJava;

public class ClassesObjectsConstructors {

	private String color;
	private String engineType;
	
	// default constructor
	public ClassesObjectsConstructors() {
		color = "white";
		engineType = "petrol";
	}
	
	// parameterized constructor
	public ClassesObjectsConstructors(String carColor, String carEngineType) {
		color = carColor;
		engineType = carEngineType;
	}
	
	public void printCarProp() {
		System.out.println("Color of Car : " + color);
		System.out.println("Type of Engine : " + engineType);
	}
	
	public static void main(String[] args) {
		
		ClassesObjectsConstructors mercedes = new ClassesObjectsConstructors("black", "petrol");
		ClassesObjectsConstructors audi = new ClassesObjectsConstructors("yellow", "diesel");
		ClassesObjectsConstructors bmw = new ClassesObjectsConstructors();
		
		mercedes.printCarProp();
		audi.printCarProp();
		bmw.printCarProp();
	}
}
