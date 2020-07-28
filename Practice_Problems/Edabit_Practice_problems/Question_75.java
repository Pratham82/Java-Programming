package Practice_Problems.Edabit_Practice_problems;
// Check if a String Contains only Identical Characters
public class Question_75 {
    public static void main(String[] args) {
        System.out.println(isIdentical("aaaa"));
        System.out.println(isIdentical("aaaaaaas"));
    }

    public static boolean isIdentical(String str) {
        int check = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(1) != str.charAt(i)){
                check++;
            }
        }
        return check==0;
    }

}
