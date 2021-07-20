package Learn_OOP_in_Java.Data_Hiding.Challeneges;

// Rectangle Class
class Rectangle {

    // Write Fields Here
    private int length,width;


    public Rectangle() {

        // Write your code here
        this.length = 0;
        this.width = 0;


    }

    public Rectangle(int length, int width) {

        // Write your code here
        this.length = length;
        this.width = width;

    }

    public int getArea() {

        // Write your code here
        return this.length * this.width;
    }

}

public class Challenge_1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2,2);
        System.out.println(r1.getArea());

    }
}
