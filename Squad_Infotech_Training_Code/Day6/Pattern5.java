package Day6;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //System.out.print("Enter the number of rows that you want to print: ");
        //int rows=scan.nextInt();
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print(0+" ");
                }else{
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
    }
}

/*
Output:
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1
1 0 1 0 1 0
1 0 1 0 1 0 1
1 0 1 0 1 0 1 0
1 0 1 0 1 0 1 0 1
1 0 1 0 1 0 1 0 1 0

 */