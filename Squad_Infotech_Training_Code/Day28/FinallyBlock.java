package Day28;

public class FinallyBlock {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);

        try{
            //int num3 = num1/num2;
            System.out.println(num1/num2);
        }
        catch(ArithmeticException ae){
            System.out.println("ArithmeticException"+ae);
        }
        //A finally block contains all the crucial statements that must be executed whether exception occurs or not.
        //The statements present in this block will always execute regardless of
        // whether exception occurs in try block or not such as closing a connection, stream etc.
        finally {
            System.out.println("This will block will run regardless of exception");
        }
    }
}
