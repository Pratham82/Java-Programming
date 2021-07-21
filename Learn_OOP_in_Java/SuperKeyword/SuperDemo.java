package Learn_OOP_in_Java.SuperKeyword;

// Base/ Parent class
class Vehicle {
    int fuelCapacity = 90;

    public void display() {
        System.out.println("I am display method from Parent class: [Vehicle class]");
    }
}

// Derived/child class
class Car extends Vehicle {
    // Declaring same field for child class
    int fuelCapacity = 60;

    public void showFuelCapacity() {
        System.out.printf("FuelCapacity from current class %s%n", this.fuelCapacity);
        // Using a parent class's variable
        System.out.printf("FuelCapacity from parent class %s%n", super.fuelCapacity);
    }

    public void display() {
        System.out.println("I am display method from Child class: [Child class]");
    }

    public void printDisplayMethod() {
        // Calling display method from parent class
        System.out.println("Calling display method from parent class:");
        super.display();

        System.out.println("Calling display method from child class");
        display();
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        // When you create an Object of a SubClass type at the same time, an Object of SuperClass type is created by calling implicitly the constructor of SuperClass.
        Car newCar = new Car();
        newCar.showFuelCapacity();
        newCar.printDisplayMethod();

    }
}

