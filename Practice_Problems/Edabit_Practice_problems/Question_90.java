package Practice_Problems.Edabit_Practice_problems;

public class Question_90 {
    public static void main(String[] args) {
        System.out.println(sameCase("hello"));
    }

    public static boolean sameCase(String str) {
        int up = 0;
        int low = 0;
        String st[] = str.split("");

        for (int i = 0; i < st.length; i++) {
            if(st[i].equals((st[i]).toUpperCase())){
                up++;
            }else {
                low++;
            }
        }
       return str.length() == up || str.length() == low;
    }
}
