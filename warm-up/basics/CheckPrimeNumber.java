import java.util.Scanner;

/**
 * CheckPrimeNumber
 */
public class CheckPrimeNumber {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int input = scan.nextInt();
    findIfPrime(input);
  }

  static boolean findIfPrime(int n) {
    int check = 0;
    int i = 1;
    while (i <= n) {
      if (n % i == 0)
        check++;
      i++;
    }

    // The prime number is fully divisible by 1 and itself
    if (check == 2)
      System.out.println(n + " is a Prime number");
    else
      System.out.println(n + " is not a Prime number");
    return check > 1;
  }
}
