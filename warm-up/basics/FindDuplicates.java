import java.util.*;

/**
 * FindDuplicates
 */
public class FindDuplicates {

  public static void main(String args[]) {
    // Code for running the program
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the length of array: ");
    int n = scan.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter " + n + " numbers: ");
    for (int i = 0; i < n; i++) {
      arr[i] = scan.nextInt();
    }
    findDuplicatesInArr(arr);
  }

  static int findDuplicatesInArr(int[] arr) {
    Stack<Integer> duplicates = new Stack<Integer>();
    for (int i = 0; i <= arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          // Priting the duplicates
          System.out.println("Duplicate found: ");
          System.out.println(arr[j]);

          // Storing the numbers in stack
          duplicates.push(arr[j]);
        }
      }
    }
    // Extra part
    System.out.println("Duplicate numbers in an array: ");
    for (int i : duplicates) {
      System.out.println(i);

    }
    return 0;
  }
}
