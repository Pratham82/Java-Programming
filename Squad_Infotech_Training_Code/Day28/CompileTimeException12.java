package Day28;

import java.io.FileInputStream;
import java.io.IOException;

public class CompileTimeException12 {
    public static void main(String[] args) {
        try{
            //It will check if the New.txt file is present in FileInputStream class
            FileInputStream fi = new FileInputStream("New.txt");
        }
        //The file new.txt is not present so, code will terminate after the exception.
        //But to avoid this exception we are using try catch block
        //io object will print out IOException
        catch(IOException io ){
            System.out.println(io);
        }
        //If the try catch block was not present, then the program will terminate
        // and below line won't be printed
        System.out.println("Code after catch block");
    }
}
