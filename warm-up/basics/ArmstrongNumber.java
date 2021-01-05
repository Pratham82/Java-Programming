import java.util.Scanner;

/**
 * ArmstrongNumber
 */
public class ArmstrongNumber {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int input = scan.nextInt();
    ifArmStrong(input);
  }

  static boolean ifArmStrong(int n) {
    // Convert the number to a String
    String num = String.valueOf(n);

    // Convert the string into character array
    char[] arr = num.toCharArray();
    int res = 0;

    for (char c : arr) {
      // Converting each character in array to a number
      int fin = Integer.parseInt(String.valueOf(c));

      // Cubing the value of each number and storing it in the res
      res += fin * fin * fin;
    }

    System.out.println(res == n ? n + " " + "is an Armstrong number" : n + " " + "is not an Armstrong number");
    return false;
  }
}
