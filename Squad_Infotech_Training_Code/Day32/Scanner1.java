package Day32;

import Day6.Pattern1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("FileWriter.txt");
        Scanner scan = new Scanner(fr);
        /*while(scan.hasNext()){
            if(scan.hasNextInt()){
                System.out.println(scan.nextInt());
            }else{
                if(scan.hasNext()){
                    scan.next();
                }
            }
        }
        System.out.println("Integer found!! ");*/

        while(scan.hasNext()){
            String pattern = scan.findInLine("Text1");
            if(pattern!=null){
                System.out.println(pattern);
            }
            else{
                scan.nextLine();
            }
        }
        System.out.println("Found pattern");
    }
}
