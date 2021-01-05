import java.util.Scanner;

/**
 * Permiter&Area
 */
public class PermiterAndArea {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the radius of circle: ");
    int input = scan.nextInt();
    AreaOfCircle(input);
    PerimeterOfCircle(input);
  }

  static double AreaOfCircle(int r) {
    double res = 3.14 * r * r;
    System.out.println("Area of circle with radius " + r + ": " + res);
    return res;
  }

  static double PerimeterOfCircle(int r) {
    double res = 2 * 3.14 * r;
    System.out.println("Permiter of circle with radius " + r + ": " + res);
    return res;
  }
}
