package Learn_OOP_in_Java.Challenegs;

public class Challenge_2 {
    public static void main(String[] args) {
        Car car1 = new Car("Ferrari", "F8", "100");
        System.out.println(car1.getDetails());
    }
}


// Car class
class Car {

    // Private Fields
    private String carName;
    private String carModel;
    private String carCapacity;

    // Default Constructor
    public Car() {

        this.carName = "";
        this.carModel = "";
        this.carCapacity = "";
    }

    // Parameterized Constructor 1
    public Car(String name, String model) {

        this.carName = name;
        this.carModel = model;
    }

    // Parameterized Constructor 2
    public Car(String name, String model, String capacity) {
        // Write your code here
        this(name, model); // Calling out parameterized constructor
        this.carCapacity = capacity; // Assign remaining fields

    }

    // Method to return car details
    public String getDetails() {

        return this.carName + ", " + this.carModel + ", " + this.carCapacity;
    }

}