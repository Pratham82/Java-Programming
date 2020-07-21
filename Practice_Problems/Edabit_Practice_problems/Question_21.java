package Practice_Problems.Edabit_Practice_problems;
// Return true if the string contains space or else false
public class Question_21 {
    public static void main(String []args){
        System.out.println(Question_21.hasSpaces("Hello "));
        System.out.println(Question_21.hasSpaces("drake"));
    }

    public static boolean hasSpaces( String str){
        String[] ss = str.split("", str.length());
        int check = 0;
        for (String s: ss){
            if(s.equals(" ")){
                check++;
            }
        }
        return check>0;
    }
}
