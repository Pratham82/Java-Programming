package Day6_Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the number of rows that you want: ");
        int rows=scan.nextInt();

        for(int i=rows;i>=1;i--){
            for(int j=rows;j>=i;j--){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}

/*
Enter the number of rows that you want: 10
10
10 9
10 9 8
10 9 8 7
10 9 8 7 6
10 9 8 7 6 5
10 9 8 7 6 5 4
10 9 8 7 6 5 4 3
10 9 8 7 6 5 4 3 2
10 9 8 7 6 5 4 3 2 1

 */