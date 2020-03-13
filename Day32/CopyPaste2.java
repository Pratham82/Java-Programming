package Day32;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyPaste2 {
    public static void main(String[] args) throws IOException,FileNotFoundException {

            FileWriter fw1 = new FileWriter("file3.txt");
            FileReader fr1 = new FileReader("file3.txt");
            FileWriter fw2 = new FileWriter("file4.txt");

            //Writing in file3

            fw1.write("This is new line");
            fw1.close();
            System.out.println("Line added successfully in file3");

            //Reading from file3
            /*int content =0;
            while((content=fr1.read())!=-1){
                System.out.print((char)content);
                //Writing content of file3 in file4
            }*/
            int content2 =0;
            while((content2=fr1.read())!=-1){
                //Writing content of file3 in file4
                fw2.write(content2);

            }
            fw2.close();
    }
}
