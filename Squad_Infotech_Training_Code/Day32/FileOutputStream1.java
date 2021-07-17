package Day32;

import java.io.*;
import java.util.Scanner;

public class FileOutputStream1 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        try {
            //FileOutputStream is used to write text in file
            //Throws FileNotFoundException
            FileOutputStream fo = new FileOutputStream("FileOutput.txt", true);
            //If we provide true argument then the new will get appended to old text
            System.out.println("Enter text here: ");
            String s1 = scan.nextLine();
            fo.write(s1.getBytes());
            System.out.println("Text is successfully added to file ");
        } catch (FileNotFoundException fn) {
            fn.printStackTrace();
        }

    }
}
