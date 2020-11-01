package Practice_Problems.Edabit_Practice_problems;

/*
Create a function that takes two numbers and a mathematical operator + - / * and will perform a calculation with the given numbers.
*/
public class Question_100 {
  public static void main(String[] args) {
    System.out.println(calculator(2, '+', 2));
    System.out.println(calculator(4, '/', 2));
  }

  public static int calculator(int num1, char operator, int num2) {
    int res = 0;
    switch (operator) {
      case '+':
        res = num1 + num2;
        break;
      case '-':
        res = num1 - num2;
        break;
      case '*':
        res = num1 * num2;
        break;
      case '/':
        if (num1 == 0 || num2 == 0) {
          res = 0;
        } else {
          res = num1 / num2;
        }
        break;

    }

    return res;
  }
}
