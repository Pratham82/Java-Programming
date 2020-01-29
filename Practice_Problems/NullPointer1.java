package Practice_Problems;

public class NullPointer1 {
    static public  void main(String[] args) {
    NullPointer1 np = new NullPointer1();
    String c = null;
    String[] d = {};
    np.method(np.a);
        //System.out.println(c.length());
    np.Null1();
        System.out.println(d.length);
    }

    String a = null;
    String b = "b variable";
    void method(String val){
        System.out.println(val);
    }
    String Null1(){
        return null;
    }
}
