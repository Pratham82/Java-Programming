package Day15;
import java.util.Scanner;

public class MultipleInheritance{
	public static void main(String []args){
		Mercedes m = new Mercedes();
		m.EnterVehDetails();
		m.EnterCarDetails();
		m.EnterMercDetails();
		m.printVehDetails();
		m.printCarDetails();
		m.printMerDetails();	
	}
}

class Vehicle{
	Scanner scan = new Scanner(System.in);
	String VehicleType;
	
	public void EnterVehDetails(){
	System.out.println("Types of Vehicle: \n1. Two Wheeler \n2. Four Wheeler");
	System.out.print("Choose Vehicle type: ");
	VehicleType = scan.next();
	}
	
	public void printVehDetails(){
	System.out.println("Vehicle type: "+VehicleType);
	}

}

//Extending Car class to Vehicle
class Car extends Vehicle{
	Scanner scan = new Scanner(System.in);
	String CarType;
	String CarBrand;

	public void EnterCarDetails(){
		System.out.println("Car types: \n1. Electric \n2. Diesel ");
		System.out.print("Choose car type: ");
		CarType = scan.next();
		System.out.println("Brands available: \n1.BMW \n2.Mercedes \n3.Porsche");
		System.out.print("Choose brand: ");
		CarBrand = scan.next();
	}
	public void printCarDetails(){
		System.out.println("Car type: "+CarType);
		System.out.println("Car Brand: "+CarBrand);
	}
}

//Extending Mercedes to Car (Parent class) and Car is extending Vehicle so the Mercedes class can use the methods and var from vehicle class and car class which both are its parent class
class Mercedes extends Car{
	Scanner scan = new Scanner(System.in);
	String MercModel;
	String MercColor;

	public void EnterMercDetails(){
		System.out.println("Models Available: \n1. A-Class \n2. B-Class \n3. C-Class \n4. Benz");
		System.out.print("Choose car model: ");
		MercModel = scan.next();
		System.out.println("Colors available : \n1. Black \n2. White \n3. Grey ");
		System.out.print("Choose color: ");
		MercColor = scan.next();
	}

	public void printMerDetails(){
		System.out.println("Mercedes model: "+MercModel);
		System.out.println("Car Color: "+MercColor);
	}
}
