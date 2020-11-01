package Practice_Problems.Edabit_Practice_problems;

/*
 * Shuffle the Name Create a method that accepts a string (of a person's first
 * and last name) and returns a string with the first and last name swapped.
 */

public class Question_99 {
  public static void main(String[] args) {
    System.out.println(nameShuffle("Donald Trump"));
  }

  public static String nameShuffle(String name) {
    String[] arr = name.split(" ");
    int len = arr.length;

    String shuffledName = "";

    for (int i = len - 1; i >= 0; i--) {
      System.out.println(arr[i]);
      shuffledName = shuffledName + " " + arr[i];
    }

    return shuffledName.trim();
  }
}
