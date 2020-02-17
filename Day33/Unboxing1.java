package Day33;

public class Unboxing1 {
    public static void main(String[] args) {
    //Unboxing: Converting an object of a wrapper type to its corresponding primitive value is called unboxing.
    //For example conversion of Integer to int.

    Integer wrapperInt1 = 452;

    //Unboxing in previous versions:
    int PrimitiveInt1 = wrapperInt1.intValue();

    //Unboxing in newer versions
    int PrimitiveInt2 = wrapperInt1;

    //Auto unboxing:
    Integer wrapperInt2 = 12;

        System.out.println(wrapperInt1+" "+PrimitiveInt2+" "+PrimitiveInt1+" "+wrapperInt2);


    }
}
