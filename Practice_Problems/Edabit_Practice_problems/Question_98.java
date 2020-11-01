package Practice_Problems.Edabit_Practice_problems;

/*
Create a function that takes the number of wins, draws and losses and calculates the number of points a football team has obtained so far.

wins get 3 points
draws get 1 point
losses get 0 points
*/

public class Question_98 {
  public static void main(String[] args) {
    System.out.println(footballPoints(3, 4, 2));
    System.out.println(footballPoints(5, 0, 2));
    System.out.println(footballPoints(0, 0, 1));
  }

  public static int footballPoints(int wins, int draws, int loses) {
    return wins * 3 + draws * 1;
  }
}
