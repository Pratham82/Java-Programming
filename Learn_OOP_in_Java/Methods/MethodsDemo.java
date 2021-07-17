package Learn_OOP_in_Java.Methods;

public class MethodsDemo {
    public static void main(String[] args) {

        Car c1 = new Car();
        System.out.println(c1.getTopSpeed());

        c1.setTopSpeed(222);
        System.out.println(c1.getTopSpeed());

        // Calling methods from Calc class
        Calc calcObj = new Calc();

        // Add method (int n, int m)
        System.out.println(calcObj.add(12, 12));

        // Add method (int n, int m)
        System.out.println(calcObj.add(12, 12, 12));

        // Add method (int n, int m)
        System.out.println(calcObj.add(12.5, 12.5));


        // Add method (int n, int m)
        System.out.println(calcObj.add(10.5, 10.5, 10.6, 10.5));
    }
}

class Car {
    int topSpeed = 150;
    String color = "Grey";
    int wheels = 4;

    // Declaring method
    public int getTopSpeed() {
        return topSpeed;
    }

    // Method for changing top speed
    public void setTopSpeed(int newSpeed) {
        topSpeed = newSpeed;
    }
}

class Calc {
    // Method overloading
    // Overloading refers to making a method perform different operations based on the nature of its arguments.
    // We could redefine a method several times and give it different arguments and method types. When the method is called,
    // the appropriate definition will be selected by the compiler!

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }

}