package Practice_Problems.Edabit_Practice_problems;
/*
Recursion
In computer science, "recursion" is the act of writing a function that calls itself
from within its own code. The function below better helps explain and illustrate
recursion by simply counting down from a given number to zero:

Example:
public static void countdown(int num) {
  int targetNumber = 0;
  if (num == targetNumber) {
    System.out.println("Countdown complete!");
  } else {
    countdown(num - 1);
  }
}

* */

// Find factorial using recursion
public class Algorithms_I_Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int num) {
        if(num ==0 ){
            return 1;
        }else{
            return factorial(num- 1) * num;
        }
    }
}
