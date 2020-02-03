package Day23;

public class ObjectComparison {
    public static void main(String[] args) {
        //This will create two different objects on heap and s0, s1 points to two different Objects
        //Because we aew using new keyword
        String s0 = new String("Michigan");
        String s1 = new String("Michigan");

        //Comparing memory location of two objects
        //This deals with heap memory
        if(s0==s1){
            System.out.println("Objects have same memory location");
        }
        else{
            System.out.println("Objects don't have same memory location");
        }

        //Now we will use literals for object creation this will store object on SCP(String constant pool)
        //This will not create redundant copy in heap. If we already have the same object in the SCP then
        //the new ref var will point to the older copy of object rather than creating new object in SCP
        //This helps with memory management and eliminated redundancy

        String s2 = "Massachusetts";
        String s3 = "Massachusetts";

        //Deals with SCP which is part of heap
        //This condition will have same memory location because both objects have same name and that's why both objects will
        //point to same object in SCP

        if(s2 == s3){
            System.out.println("Objects have same memory location");
        }
        else{
            System.out.println("Objects don't have same memory location");
        }

    }
}
