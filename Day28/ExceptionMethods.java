package Day28;

import java.io.IOException;

public class ExceptionMethods {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);

        try{
            //int num3 = num1/num2;
            System.out.println(num1/num2);
        }

        catch(Exception e){
            //Methods of exception
            //Parent exception class Exception
            //Returns the type of exception
            //System.out.println("Exception "+e);

            //2. getMessage()
            //Returns a detailed message about the exception that has occurred.
            // This message is initialized in the Throwable constructor.
            //System.out.println(e.getMessage());

            //3. fillInStackTrace()
            //Fills the stack trace of this Throwable object with the current stack trace,
            // adding to any previous information in the stack trace.
            //System.out.println(e.fillInStackTrace());

            //4. toString()
            //Returns the name of the class concatenated with the result of getMessage()
            //System.out.println(e.toString());

            //5. printStackTrace()
            //Prints the result of toString()
            //along with the stack trace to System.err, the error output stream.
            //Returns the exception name with the source of the exception
            e.printStackTrace();


        }

       /* catch(ArithmeticException ae){
            //Returns the cause of the exception as represented by a Throwable object.

            //Implementation 1
            //IOException io = new IOException();
            //ae.initCause(io);
            //System.out.println(ae.getCause());

            //Implementation 2
            //ae.initCause(new IOException());
            //System.out.println(ae.getCause());
        }*/
    }
}
