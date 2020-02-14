package Day32;

import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriter1 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        try{
            FileWriter fw = new FileWriter("FileWriter.txt");
            System.out.println("Enter text here: ");
            String s1 = scan.nextLine();
            fw.write(s1);
            fw.flush();
            fw.close();
            System.out.println("Text is successfully added to file ");
        }catch(IOException io){
            io.printStackTrace();
        }
    }
}
