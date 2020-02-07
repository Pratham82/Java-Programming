package Day26;

import java.util.function.Predicate;

public class PredicateInterfaceLogical {
    public static void main(String[] args) {
        Predicate<String> p1 = String1-> {
            return String1.equals("Java");
        };

        /*And &&
        This will first check if the string entered is equal to Java and &&
        The string length is also greater than 10
        In this case on of the condition is not correct, so it prints out false.
        Declaration:
        p1.and(String1->String1.length()>10);
        p1 will check if the string which is provided in arguments, is equal to the
        returned string in our above method. .and is used as && operator, it will compare
        the 1st method which p1 is pointing to, and the p2's pointed method which is
        checking if the string's length is more that 10

        */
         //And &&
        Predicate<String> p2 = p1.and(String1->String1.length()>10);
        System.out.println(p2.test("Java"));

        //OR ||
        //it will work as OR operator between two methods
        Predicate<String> p3 = p1.or(String1->String1.length()>10);
        System.out.println(p3.test("Java"));

        //Negation !
        //It will work like a not operator
        //If the output is true it will print out false and vice versa
        Predicate<String> p4 = p1.negate();
        System.out.println(p4.test("Java123"));





    }
}
