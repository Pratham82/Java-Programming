package Day25;

import java.util.StringJoiner;

public class StringJoiner1 {
    public static void main(String[] args) {
        StringJoiner sj1 = new StringJoiner(",");

        //setEmpty
        System.out.println(sj1.setEmptyValue("This string is empty"));

        //add
        sj1.add("Java");
        sj1.add("Programming");
        sj1.add("For");
        sj1.add("beginners");
        System.out.println(sj1);

        //length
        System.out.println(sj1.length());

        //StringJoiner()
        StringJoiner sj2 = new StringJoiner(":","[","]");
        sj2.add("First name");
        sj2.add("Middle name");
        sj2.add("Last name");
        System.out.println(sj2);

        //Merge
     /*   StringJoiner sj3 =sj1.merge(sj2);
        System.out.println(sj3);
*/


        StringJoiner sj4 =sj2.merge(sj1);
        //The value of sj1 will be merged with sj2 at the end but suffix and prefix will be sane as sj2
        System.out.println("Value of sj4: "+sj4);

        StringJoiner sj5 =sj1.merge(sj2);
        System.out.println("Value of sj5: "+sj5);






    }
}
