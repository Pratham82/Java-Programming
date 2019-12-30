package Day6_Patterns;

        import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the number of rows that you wanted to print: ");
        int rows= scan.nextInt();
        for(int i=rows;i>=1;i--){
            for(int j=rows;j>=i;j--){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}

/*
Enter the number of rows that you wanted to print: 10
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