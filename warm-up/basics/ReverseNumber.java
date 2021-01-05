import java.util.Scanner;

/**
 * ReverseNumber
 */
public class ReverseNumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int input = scan.nextInt();
    reverse(input);
  }

  static int reverse(int num) {
    int rev = 0;
    while (num != 0) {
      // Alt method:
      // int dig = num % 10;
      // rev = rev * 10 + dig;
      // num /= 10;

      rev = rev * 10 + num % 10;
      // System.out.println(rev);
      num /= 10;
    }

    System.out.println(rev);
    return 0;
  }
}
