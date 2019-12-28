package Day5;

import java.util.Scanner;

public class TableFor {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the number to get its table from 0 to 10: ");
        int num= scan.nextInt();
        int Table;
        for(int i=1;i<=10; i++){
            Table= num*i;
            System.out.println(Table);
        }
    }
}
