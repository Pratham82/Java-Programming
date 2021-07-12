package Practice_Problems.Edabit_Practice_problems.Wam_up.Convenience_Store;

//Given a total due and an array representing the amount of change in your pocket, determine whether or not you are able to pay for the item. Change will always be represented in the following order: quarters, dimes, nickels, pennies.
//To illustrate: changeEnough([25, 20, 5, 0], 4.25) should yield true, since having 25 quarters, 20 dimes, 5 nickels and 0 pennies gives you 6.25 + 2 + .25 + 0 = 8.50.

public class Solution {
    public static void main(String[] args) {
        int[] changes = new int[]{2, 100, 0, 0};
        int[] changes2 = new int[]{25, 20, 5, 0};

        System.out.println(changeEnough(changes,14.11));
        System.out.println(changeEnough(changes2,4.25));
    }

    public static boolean changeEnough(int[] change, double amountDue) {
        double sum = 0;
        double [] coins = new double[]{0.25,0.10,0.05,0.01};
        for (int i = 0; i <coins.length; i++) {
            sum += change[i] * coins[i];
        }
        return sum >= amountDue;
    }
}
