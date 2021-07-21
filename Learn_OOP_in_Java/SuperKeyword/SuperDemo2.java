package Learn_OOP_in_Java.SuperKeyword;

/*

Syntax for constructors:

super();  //calls the (no argument) constructor if a no-argument constructor is defined in the SuperClass

super(parameters); //calls the parameterized constructor of the SuperClass with matching parameters from the SubClass constructor

 The call to the SuperClass constructor using super() is usually the first line of code inside the constructor of the SubClass.
 If we do not call super() in the SubClass constructor, the default no-argument constructor of SuperClass is called automatically.
 The super(parameters) call has to be used if we want to call a parameterized constructor of the SuperClass.:w

 */

class VehicleNew {
    private String make, color, model;
    private int year;

    VehicleNew(String make, String color, String model, int year) {
        System.out.println("Calling constructor from Parent class");
        this.make = make;
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public void printDetails() {
        System.out.printf("Manufacturer:  %s \nColor: %s\nYear: %s\nModel: %s", make, color, year, model);
    }
}

class CarNew extends VehicleNew {
    // Field from CarNew class
    String bodyStyle;

    // Creating constructor matching with superClass or parent claas
    // The order of constructor parameters should match with the super class
    public CarNew(String make, String model, String color, int year, String bodyStyle) {
        // In a constructor we can include a call to super() or this() but not both. Also, these calls can only be used inside the constructors.
        // super();
        // super(make, model, color, year); // Wrong order
        super(make, color, model, year); // Correct order
        System.out.println("Calling constructor from Child class");
        this.bodyStyle = bodyStyle;
    }

    public void printCarDetails() {
        printDetails();
        System.out.println("\nbody style: " + bodyStyle);
    }
}

public class SuperDemo2 {
    public static void main(String[] args) {
        // VehicleNew newVehicle = new VehicleNew("Hyundai", "Red", "City", 2021);
        // newVehicle.printDetails();
        CarNew newVehicle = new CarNew("Hyundai", "City", "Red", 2021, "Sedan");
        newVehicle.printCarDetails();
    }
}
