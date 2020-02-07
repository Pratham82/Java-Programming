package Day26;

import java.util.function.Predicate;

public class PredicateInterface1 {
    public static void main(String[] args) {
        /*Predicate interface is a predefined interface in the java.
            Syntax:
            1. Declaration: Predicate<data type> reference_variable = Local_variable -> {
            return type(Which is used while declaration)
            };
            (int) is not available as data type here we have to use Integer which contains (int).
            We have to use the local variable and perform the operation to which the output can be true or false.

            2. Implementation: print statement(reference variable for an interface.test(Appropriate arguments));
            the (test) method in here is the method from predicate interface which is predefined in java from JDK 8
        */

        Predicate<String > p1= x->{
            return x.equals("Test");
        };
        System.out.println(p1.test("Test"));

        //We can also write the above code as expression lambda
        Predicate<String > p11= x-> x.equals("Test");
        System.out.println(p11.test("Test"));

        Predicate<Integer > p2= x->{
            return x>10;
        };
        System.out.println(p2.test(454));

        //
        Predicate<Integer > p22= x-> x>10;
        System.out.println(p22.test(14));
    }
}
