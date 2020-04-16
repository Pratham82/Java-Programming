package HackerRank.Day_1_Data_Types;

import java.util.Scanner;

public class Day_1_Data_Types {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
            int i2;
            double d2;
            String s3;

            i2= scan.nextInt();
            d2= scan.nextDouble();
            s3=scan.nextLine();
            System.out.println(i+i2);
            System.out.println(d+d2);
            System.out.println(s.concat(s3));
            scan.close();
    }
}
