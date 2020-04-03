package Practice_Problems;
//Write a Java program to check if a particular element exists in a linked list.
import java.util.ArrayList;
import java.util.Scanner;

public class Collections2 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to find in the Array List: ");
        int num = scan.nextInt();

        ArrayList<Integer> al1= new ArrayList<>();
        al1.add(324);
        al1.add(654);
        al1.add(465);
        al1.add(289);
        al1.add(787);
        
        int count =0;
        for(int i: al1){
            if(al1.contains(num)){
                count++;
            }
        }
        if(count>0){
            System.out.println("Number found in list which is: "+num);
        }else{
            System.out.println("Number does not exist in list");
        }

        for(int i:al1){
            System.out.println(i);
        }
        scan.close();
    }
}
