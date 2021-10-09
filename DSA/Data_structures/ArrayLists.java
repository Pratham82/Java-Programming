package DSA.Data_structures;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        /*
        ArrayList methods:
        add
        remove (based on index)
        remove (baaed on object)
        get
        set

         */
        //Adding elements to arrayList
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(13);
        arrayList1.add(4);

        System.out.println(arrayList1);
        // Add elements to a specific index in arraylist
        arrayList1.add(2,22);

        // If the index provided is greater that arrayList's size then we will get indexOutOfBounds exception
        // arrayList1.add(11,12);
        System.out.println(arrayList1);

        // Remove the object based on the passed index
        arrayList1.remove(2);
        System.out.println(arrayList1);


        // Remove the object based on the passed object
        // This will remove the first instance of the object passed into the arraylist
        arrayList1.remove(new Integer(13));
        System.out.println(arrayList1);

        // Get element present on the given index
        System.out.println(arrayList1.get(2));


    }
}
