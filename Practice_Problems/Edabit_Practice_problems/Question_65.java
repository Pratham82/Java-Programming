package Practice_Problems.Edabit_Practice_problems;

import java.util.Arrays;
/*
Create a function that takes a string as an argument and returns a coded (h4ck3r 5p34k) version of the string.

Examples
hackerSpeak("javascript is cool") ➞ "j4v45cr1pt 15 c00l"

hackerSpeak("programming is fun") ➞ "pr0gr4mm1ng 15 fun"

hackerSpeak("become a coder") ➞ "b3c0m3 4 c0d3r"
Notes
In order to work properly, the function should replace all 'a's with 4, 'e's with 3, 'i's with 1, 'o's with 0, and 's's with 5.
 */
public class Question_65 {
    public static void main(String[] args) {
        System.out.println(hackerSpeak("javascript is cool"));
        System.out.println(hackerSpeak("hi there"));
    }

    public static String hackerSpeak(String str){
        String newStr[] = str.split("");
        String hackStr[] = new String[newStr.length];

        for(int i =0; i< newStr.length; i++){

            if(newStr[i].equals("a")){
                hackStr[i] = "4";
            }else if(newStr[i].equals("e")){
                hackStr[i] = "3";
            }else if(newStr[i].equals("i")){
                hackStr[i] = "1";
            }else if(newStr[i].equals("o")){
                hackStr[i] = "0";
            }else if(newStr[i].equals("s")){
                hackStr[i] = "5";
            }else{
                hackStr[i] = newStr[i];
            }
        }

        return String.join("",hackStr);

    }
}
