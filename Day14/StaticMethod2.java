package Day14;
import java.util.Scanner;
class test{
    Scanner scan = new Scanner(System.in);

    ///Static method creation
    static void Greeting(){
        System.out.println("Hello");
    }

    public void SayHelloToUser(){
        System.out.print("Enter user name = ");
        String un = scan.next();
        System.out.println("Hello "+un);
    }
    static void Goodbye(){
        System.out.println("Goodbye");
    }
}

public class StaticMethod2 {
    public static void main(String[] args) {
        test.Greeting();      //Calling static method
        test t = new test();
        t.SayHelloToUser();
        test.Goodbye();

    }
}
