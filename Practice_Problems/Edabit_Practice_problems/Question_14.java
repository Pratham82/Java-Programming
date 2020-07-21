package Practice_Problems.Edabit_Practice_problems;

public class Question_14 {
    public static void  main(String args[]){
        System.out.println(Question_14.profitableGamble(0.2,50,9));
    }

    public static boolean profitableGamble(double prob,int prize, int pay){
        return prob*prize >pay;
    }
}
