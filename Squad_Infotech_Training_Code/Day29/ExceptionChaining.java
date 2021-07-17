package Day29;

import java.io.IOException;

public class ExceptionChaining {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        //Chained Exceptions allows to relate one exception with another exception,
        // i.e one exception describes cause of another exception.

        try{
            //int num3 = num1/num2;
            System.out.println(num1/num2);
        }catch(ArithmeticException ae) {
            IOException io = new IOException();
            //getCause() method :- This method returns actual cause of an exception.
            //initCause(Throwable cause) method :- This method sets the cause for the calling exception
            ae.initCause(io);
            System.out.println(ae.getCause());
        }
        }
    }
