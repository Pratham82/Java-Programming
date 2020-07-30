package Practice_Problems.Edabit_Practice_problems;
/*
Hot Pics of Danny DeVito!
I'm trying to watch some lectures to study for my next exam but I keep getting distracted by meme compilations, vine compilations, anime, and more on my favorite video platform.

Your job is to help me create a function that takes a string and checks to see if it contains the following words or phrases:

"anime"
"meme"
"vines"
"roasts"
"Danny DeVito"
If it does, return "NO!". Otherwise, return "Safe watching!".
 */
public class Question_92 {
    public static void main(String[] args) {
        System.out.println(preventDistractions("vines that butter my eggroll")); //NO!
        System.out.println(preventDistractions("How to ace BC Calculus in 5 " +
                "Easy Steps"));// Safe watching!
        System.out.println(preventDistractions("Hot pictures of Danny DeVito"));

    }

    public static String preventDistractions(String args) {
        String [] s = args.split(" ");
        int check =0;
        for(int i =0; i< s.length; i++){
            if(s[i].equals("anime")||s[i].equals("meme") ||s[i].equals("vines") ||s[i].equals("roasts")||s[i].equals("Danny")|| s[i].equals("DeVito")){
                check++;
            }
        }
        return check==0? "Safe watching!":"NO!";
    }
}
