package Day32;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
    public static void main(String []args) throws IOException{
        try{
            FileReader fr = new FileReader("FileWriter.txt");
            char[] c1 = new char[100];
            fr.read(c1);
            for(int i=0; i<c1.length;i++){
                System.out.print(c1[i]);
            }
        }catch(FileNotFoundException fe){
            fe.printStackTrace();
        }
    }
}
