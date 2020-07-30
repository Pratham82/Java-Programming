package Practice_Problems.Edabit_Practice_problems;
/*
Owofied a Sentence
Create a function that takes a sentence and turns every "i" into "wi" and "e" into "we", and add "owo" at the end.

Examples
owofied("I'm gonna ride 'til I can't no more")
➞ "I'm gonna rwidwe 'twil I can't no
 */
public class Question_94 {
    public static void main(String []args){
        System.out.println(owofied("I'm gonna ride 'til I can't no more"));
    }
    public static String owofied(String sentence){
        String sp[] = sentence.split("");
        String ne[] = new String[sp.length];
        for(int i=0; i<sp.length; i++){
                if(sp[i].equals("i")){
                    ne[i] = "wi";
                }else if(sp[i].equals("e")){
                    ne[i] = "we";
                }else{
                    ne[i] = sp[i];
                }

        }

        return String.join("",ne) +" owo";

        // using regex
        //return s.replace("i", "wi").replace("e", "we") + " owo";
    }
}
