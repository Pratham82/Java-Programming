package Practice_Problems;

public class NullPointer1 {
    public static void main(String[] args) {
    NullPointer1 np = new NullPointer1();
    String c = null;

    String d = "hi";

    np.method(np.b);
    System.out.println(d);
    System.out.println(np.b);
    //System.out.println(c.length()); will give nullPointer exception
    }

    String a = null;
    String b = "b variable";

    void method(String val){
        System.out.println(val);
    }
    
}
