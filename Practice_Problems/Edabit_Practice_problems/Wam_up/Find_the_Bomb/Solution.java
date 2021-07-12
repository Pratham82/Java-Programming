package Practice_Problems.Edabit_Practice_problems.Wam_up.Find_the_Bomb;
import java.util.Locale;
import java.util.regex.*;

import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        String egString = "There is a BOMB";
        System.out.println(bomb(egString));

    }
    public static String bomb(String str) {
        // Solving using string array and string comparison
//        String isBombPresent = "";
//        String[]arr = str.split(" ");
//        for(String word: arr){
//            if(word.equalsIgnoreCase("bomb"))
//                isBombPresent = "DUCK!";
//                else isBombPresent = "No Duck";
//        }
//        return isBombPresent;

        // Solving using regEx
        if(str.toLowerCase().contains("bomb")) return "DUCK!";
        else return  "Relax, there's no bomb.";


    }
}
