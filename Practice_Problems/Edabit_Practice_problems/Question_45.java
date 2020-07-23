package Practice_Problems.Edabit_Practice_problems;
/*
A bartender is writing a simple program to determine whether he should serve drinks to someone. He only serves drinks to people 18 and older and when he's not on break.

Given the person's age, and whether break time is in session, create a function which returns whether he should serve drinks.
*/
public class Question_45 {
    public static void main(String[] args) {
        System.out.println(shouldServeDrinks(17, true));
        System.out.println(shouldServeDrinks(19, false));
        System.out.println(shouldServeDrinks(30, true));
    }

    public static boolean shouldServeDrinks(int age ,boolean onBreak){

        return age>=18 && !onBreak;
    }
}
