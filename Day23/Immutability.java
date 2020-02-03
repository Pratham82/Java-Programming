package Day23;

public class Immutability {
    public static void main(String[] args) {
        String s0 = new String("Java");
        String s1 = s0.concat(" Programming");
        System.out.println("s0: "+s0);
        System.out.println("s1: "+s1);

        //In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.
        //Once string object is created its data or state can't be changed but a new string object is created.

        if(s0==s1){
            System.out.println("Objects have same memory location");
        }
        else{
            System.out.println("Objects don't have same memory location");
        }

        //That's why when we concat "programming" to java it will create new object named "Java programming" and
        //because of that both objects have different memory location
    }
}
