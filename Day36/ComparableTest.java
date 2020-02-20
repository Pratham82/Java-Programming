package Day36;

import java.util.*;

public class ComparableTest {
    public static void main(String[] args) {
        ComparableClass cc1 = new ComparableClass(102,"George",52);
        ComparableClass cc2 = new ComparableClass(109,"Franklin",96);
        ComparableClass cc3 = new ComparableClass(102,"Michael",64);
        ComparableClass cc4 = new ComparableClass(101,"Trevor",91);
        ComparableClass cc5 = new ComparableClass(105,"Joe",39);

        System.out.println("Creating list of Comparable class type");
        List<ComparableClass> cc = new ArrayList<ComparableClass>();
        cc.add(cc1);
        cc.add(cc2);
        cc.add(cc3);
        cc.add(cc4);
        cc.add(cc5);

        //Sorting list
        Collections.sort(cc);

        System.out.println("Printing list: ");
        for(ComparableClass c: cc){
            System.out.println(c);
        }
        System.out.println("---------------------");

    }
}
