package Learn_OOP_in_Java.Classes_and_Objects;

public class MyClass {
    public static void main(String[] args) {
        // Creating object of a class car
        Car car1 = new Car();
        System.out.println(car1);
        System.out.println(String.format("Top speed: %s\nTotal Seats: %s\nFuel Capacity: %s", car1.topSpeed, car1.totalSeats, car1.fuelCapacity));

        // Accessing static filed of a class
        String nPlate = Car.numberPlate;
        System.out.println(nPlate);


    }
}


class Car {
    public int topSpeed;
    public int totalSeats;
    public int fuelCapacity;
    public boolean isParked;
    public boolean isDriving;
    public String manufacturer;
    static String numberPlate = "23235FDF";
    final int tires = 4;




    public void drive(boolean state) {
        this.isDriving = state;
    }


    // Changing final field
//    public void setTires(int newTires){
//        tires = newTires; // Cause error
//    }
}