package Practice_Problems.Edabit_Practice_problems;
// Create a function that counts the number of syllables a word has. Each syllable is separated with a dash -.
public class Question_56 {
    public static void main(String[] args) {
        System.out.println(numberSyllables("beau-ti-ful"));
    }

    public static int numberSyllables(String word){
        return (word.split("-")).length;
    }

}
