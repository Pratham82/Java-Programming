
package Learn_OOP_in_Java.Inheritance;

class Vehicle {
	// Private fields
	private String make, color, model;
	private int year;

	// Parameterized constructor
	public Vehicle(String make, String color, String model, int year) {
		this.make = make;
		this.color = color;
		this.model = model;
		this.year = year;
	}

	// Public method to print details
	public void printDetails() {
		System.out.println("Manufacturer: " + make);
		System.out.println("Color: " + color);
		System.out.println("Year: " + year);
		System.out.println("Model: " + model);
	}
}

class Car extends Vehicle {

	// Private field on car class
	private String bodyStyle;

	// Parameterized constructor
	public Car(String make, String color, String model, int year, String bodyStyle) {
		super(make, color, model, year);
		this.bodyStyle = bodyStyle;
	}

	// Method from child class
	public void carDetails() {
		// Calling a method from parent class
		printDetails();
		System.out.println("Body Style: " + bodyStyle);
	}

}

class Inheritance {
	public static void main(String[] args) {
		Car car1 = new Car("Hyundai", "Red", "City", 2020, "Sedan");
		car1.carDetails();

	}
}