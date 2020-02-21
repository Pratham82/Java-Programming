package Day36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        ComparatorClass cc1 =new ComparatorClass(542,"George",9564);
        ComparatorClass cc2 =new ComparatorClass(654,"Franklin",9564);
        ComparatorClass cc3 =new ComparatorClass(894,"Michael",21564);
        ComparatorClass cc4 =new ComparatorClass(352,"Trevor",78954);
        ComparatorClass cc5 =new ComparatorClass(891,"John",59878);
        ComparatorClass cc6 =new ComparatorClass(311,"Torin",321545);
        ComparatorClass cc7 =new ComparatorClass(211,"Jack",84564);


        List<ComparatorClass> cc = new ArrayList<ComparatorClass>() ;
        System.out.println("Adding objects to list: ");
        cc.add(cc1);
        cc.add(cc2);
        cc.add(cc3);
        cc.add(cc4);
        cc.add(cc5);
        cc.add(cc6);
        cc.add(cc7);

        System.out.println("Sorting lists by CustomerID");
        Collections.sort(cc,new CompareID());
        System.out.println("Printing list: ");
        for(ComparatorClass c: cc){
            System.out.println(c);
        }
        System.out.println("-------------------------------");

        System.out.println("Sorting lists by CustomerName");
        Collections.sort(cc,new CompareName());
        System.out.println("Printing list: ");
        for(ComparatorClass c: cc){
            System.out.println(c);
        }
        System.out.println("-------------------------------");

    }
}
