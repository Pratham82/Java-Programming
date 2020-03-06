package Day32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream1 {
    public static void main(String []args) throws IOException {
        /*
        try{
            FileInputStream fi = new FileInputStream("FileOutput.txt");
            byte [] b1 = new byte [100];
            fi.read(b1);
            for(int i=0;i<b1.length; i++){
                System.out.print((char)b1[i]);
            }
        }catch(FileNotFoundException fe){
            fe.printStackTrace();
        }*/
        FileInputStream fi = new FileInputStream("FileOutput.txt");
        int i = 0;
        char c;


        // read till the end of the file
        while((i = fi.read())!=-1) {

            // converts integer to character
            c = (char)i;

            // prints character
            System.out.print(c);
        }

    }
}
