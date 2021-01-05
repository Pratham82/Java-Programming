import java.util.Scanner;

/**
 * EvenNumberTest
 */
public class EvenNumberTest {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the last number: ");
    int lastNum = scan.nextInt();
    evenFor(lastNum);
    evenWhile(lastNum);

  }

  static int evenFor(int n) {
    for (int i = 1; i <= n; i++) {
      // The number is even only if its divisible by 2
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
    return 0;
  }

  static int evenWhile(int n) {
    int i = 1;
    while (i <= n) {
      if (i % 2 == 0)
        System.out.println(i);
      i++;
    }
    return 0;
  }

}
