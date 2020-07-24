package Practice_Problems.Edabit_Practice_problems;
/*
Create a function that returns the smaller number.
Numbers will be represented as strings, and your output should also be a string.
If both numbers tie, return either number.
Numbers will be positive.
Bonus: See if you can do this without converting to integers.

 */
public class Question_55 {
    public static void main(String[] args) {
        System.out.println(smallerNum("41","85"));
    }

    public static String smallerNum(String n1 ,String n2){

        return String.valueOf((Math.min(Integer.parseInt(n1),
                Integer.parseInt(n2))));
    }
}
