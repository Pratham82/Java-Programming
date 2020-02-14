package Day32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream1 {
    public static void main(String []args) throws IOException {
        try{
            FileInputStream fi = new FileInputStream("FileOutput.txt");
            byte [] b1 = new byte [100];
            fi.read(b1);
            for(int i=0;i<b1.length; i++){
                System.out.print((char)b1[i]);
            }
        }catch(FileNotFoundException fe){
            fe.printStackTrace();
        }
    }
}
