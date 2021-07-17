package Day32;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter2 {
    public static void main(String[] args) throws IOException {
        /*The Java PrintWriter class (java.io.PrintWriter) enables
        you to write formatted data to an underlying Writer.

        * For instance, writing int, long and other primitive data
        formatted as text, rather than as their byte values.

        *The Java PrintWriter is useful if you are generating reports
         (or similar) where you have to mix text and numbers.
        * */
        FileWriter fw = new FileWriter("Print.txt");
        PrintWriter pw=  new PrintWriter(fw);
        //Writing in file
        pw.write("465454 this is done using print writer");
        System.out.println("text Added to Print.txt file");
        pw.close();

        //Writing in console
        PrintWriter pw2 = new PrintWriter(System.out);
        pw2.write("This is txt 1");
        pw2.close();
    }
}
