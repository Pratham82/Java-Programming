package Practice_Problems.Edabit_Practice_problems;
// Create a function that takes in a word and determines whether or not it is plural. A plural word is one that ends in "s".
public class Question_35 {
    public static void main(String[] args) {
        System.out.println(isPlural("change"));
        System.out.println(isPlural("changes"));
    }
    public static boolean isPlural(String word){
        return word.endsWith("es") || word.endsWith("s");
    }
}
