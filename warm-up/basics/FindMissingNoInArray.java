import java.util.Scanner;

/**
 * FindMissingNoInArray
 */
public class FindMissingNoInArray {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the amount of elements that you want in array: ");

    int n = scan.nextInt();
    int[] inputArr = new int[n];
    System.out.println("enter" + n + "numbers: ");
    // Taking input
    for (int i = 0; i < n; i++) {
      inputArr[i] = scan.nextInt();
    }

    findMissingNo(inputArr, inputArr.length);

  }

  static int findMissingNo(int arr[], int len) {
    int n = len;
    int total = (n + 1) * (n + 2) / 2;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      // sum += arr[i];
      total -= arr[i];
    }

    System.out.println("The missing number is: " + total);
    return 0;
  }

}
