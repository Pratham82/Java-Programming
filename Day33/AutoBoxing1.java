package Day33;

public class AutoBoxing1 {
    public static void main(String []args){
    //Boxing: Converting a primitive value into an object of the corresponding wrapper class is called autoboxing/wrapping.
    //For example, converting int to Integer class.


    //Boxing
    int PrimitiveInt = 10;
    //Previous java versions till JDK 8 syntax:
    //Integer wrapperInt = new Integer(PrimitiveInt);
    Integer wrapperInt1 = PrimitiveInt;

    System.out.println("Primitive var value: "+PrimitiveInt+" "+"Wrapper class's var value: "+wrapperInt1);

    //Auto-boxing
    //Compiler automatically converts(boxes/Wraps) the primitive type variable to Wrapper class
    Integer wrapperInt2 =  PrimitiveInt;


    /*
    * */

    }
}
