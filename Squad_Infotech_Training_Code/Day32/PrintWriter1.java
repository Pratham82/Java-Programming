package Day32;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriter1 {
    public static void main(String []args) throws IOException {
        Scanner scan = new Scanner(System.in);
       try{
           FileWriter fw = new FileWriter("NewFile.txt");
           //Storing data in file
           /* PrintWriter pw=  new PrintWriter(fw);
            pw.write("This is");
            pw.write("Print writer's text");
            pw.close();*/

           //Storing data in console
           PrintWriter pw1=  new PrintWriter(System.out);
           pw1.write("This file ");
           pw1.write("will be printed on Console");
           pw1.close();

       }catch(IOException io){
           io.printStackTrace();
        }
    }
}
