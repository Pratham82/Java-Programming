package Day32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPaste {
    public static void main(String[] args) throws IOException {
        try{
            FileOutputStream fos1 = new FileOutputStream("File1.txt");
            FileInputStream fis1 = new FileInputStream("File1.txt");
            FileOutputStream fos2 = new FileOutputStream("File2.txt");

            //Writing text int File1
            String s1 ="Hi this is 1st line in this file";
            fos1.write(s1.getBytes());
            fos1.close();
            System.out.println("Text is added to file 1");

            //Copy pasting text of file1 to file2
            int content =0;
            while(content!=-1){
                //Reading the file1
                content= fis1.read();
                //Writing in file2
                fos2.write((char)content);

            }
            System.out.println("Content added to file2");
        }catch(FileNotFoundException fe){
            fe.printStackTrace();
        }

    }
}
