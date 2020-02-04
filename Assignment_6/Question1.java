package Assignment_6;
//Take any String and display char of that String which is present at even index.
public class Question1 {
    public static void main(String[] args) {
        String s1 = "012345678";
        int len = s1.length();
        for(int i =0; i<=len; i++){
            if(i%2==0){
                System.out.print(s1.charAt(i));
            }
        }
    }
}
