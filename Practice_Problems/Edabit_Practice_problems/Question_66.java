package Practice_Problems.Edabit_Practice_problems;
/*
* Create a function that takes a character and a string as arguments and returns the number of times the character is found in the string.
* Your output must be case-sensitive (see second example).
* */
public class Question_66 {
    public static void main(String[] args) {
        System.out.println(charCount('a', "edabit"));//1
        System.out.println(charCount('c', "Chamber of secrets"));
    }

    public static int charCount(char c, String str){
        int count=0;
        for(int i =0; i<str.length(); i++){
            if(c == str.charAt(i)){
                count++;
            }
        }

        return count;
    }
}
