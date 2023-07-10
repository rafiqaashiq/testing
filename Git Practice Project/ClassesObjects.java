package coreJava;

public class ClassesObjects {

	private String color;
	private String engineType;
	
	// default constructor
	public ClassesObjects() {
		color = "white";
		engineType = "petrol";
	}
	
	// parameterized constructor
	public ClassesObjects(String carColor, String carEngineType) {
		color = carColor;
		engineType = carEngineType;
	}
	
	public void printCarProp() {
		System.out.println("Color of Car : " + color);
		System.out.println("Type of Engine : " + engineType);
	}
	
	public static void main(String[] args) {
		
		ClassesObjects mercedes = new ClassesObjects("black", "petrol");
		ClassesObjects audi = new ClassesObjects("yellow", "diesel");
		ClassesObjects bmw = new ClassesObjects();
		
		mercedes.printCarProp();
		audi.printCarProp();
		bmw.printCarProp();
	}
}
