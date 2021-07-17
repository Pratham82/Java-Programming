package Day25;

interface I3{
    void bark();
}

public class LambdaExpression1 {
    public static void main(String[] args) {
        //Overriding method using anonymous class
        I3 obj1 = new I3(){

            @Override
            public void bark() {
                System.out.println("bark method from I3 using anonymous class");
            }
        };
        obj1.bark();

        /*Overriding method using Lambda expression:
        Lambda expression is used in java to override methods of functional interface
        Java lambda expressions are commonly used to implement simple
         event listeners / callbacks, or in functional programming with the Java Streams API.*/
        I3 obj2 = () ->{
            System.out.println("bark method from I3 using lambda expression ");
        };
        obj2.bark();
    }
}
