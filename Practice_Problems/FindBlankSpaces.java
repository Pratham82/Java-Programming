package Practice_Problems;
//Find blank spaces in the given sentences.
import java.util.Scanner;

public class FindBlankSpaces {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence to find blank spaces: ");
        String s1= scan.nextLine();
        int count =0;
        for(int i= 0; i<s1.length(); i++){
            if(s1.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("Number of blank spaces: "+count);
        scan.close();
    }
}
