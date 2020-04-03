package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Day_2_Operators {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip= meal_cost* tip_percent /100;
        double tax= meal_cost* tax_percent/100;
        int totalCost = (int) Math.round(meal_cost + tip + tax);
        System.out.println(totalCost);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();

        int tip_percent = scanner.nextInt();

        int tax_percent = scanner.nextInt();

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
