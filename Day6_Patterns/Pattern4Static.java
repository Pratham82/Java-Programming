package Day6_Patterns;

import java.util.Scanner;

public class Pattern4Static {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //System.out.print("Enter the number of rows that you want: ");
        //int rows=scan.nextInt();

        for(int i=10;i>=1;i--){
            for(int j=10;j>=i;j--){
                System.out.print(i +" ");   //This will print only values of i
            }
            System.out.println();
        }
    }
}

/*
Output:
10
9 9
8 8 8
7 7 7 7
6 6 6 6 6
5 5 5 5 5 5
4 4 4 4 4 4 4
3 3 3 3 3 3 3 3
2 2 2 2 2 2 2 2 2
1 1 1 1 1 1 1 1 1 1

 */