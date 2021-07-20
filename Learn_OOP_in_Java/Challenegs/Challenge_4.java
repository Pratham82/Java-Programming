package Learn_OOP_in_Java.Challenegs;

import java.lang.Math;

class Point {

    // Private fields
    private int x;
    private int y;

    // Default Constructor
    public Point() {
        // Implement the function
        this.x = 0;
        this.y = 0;
    }

    // Parameterized Constructor
    public Point(int x, int y) {
        // Implement the function
        this.x = x;
        this.y = y;

    }

    public double distance() {
        // Implement the function
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double distance(int x2, int y2) {
        // Implement the function
        return Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
    }
}

public class Challenge_4 {
    public static void main(String[] args) {
        Point p1 = new Point(5, 5);
        System.out.println(p1.distance());
        System.out.println(p1.distance(2, 1));

    }
}


