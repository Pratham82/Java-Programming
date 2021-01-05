import java.util.Scanner;

/**
 * PowerOfNumber
 */
public class PowerOfNumber {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = scan.nextInt();
    System.out.println("Enter the exponent");
    int exponent = scan.nextInt();
    findPower(num, exponent);
  }

  static int findPower(int num, int expo) {
    int res = 1;
    // We will run the loop until the exponential becomes zero because we will be
    // decreasing it every step
    while (expo != 0) {
      res = res * num;
      expo--;
    }

    System.out.println(num + "^" + expo + ": " + res);
    return 0;
  }
}
