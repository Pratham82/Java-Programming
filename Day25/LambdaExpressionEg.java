package Day25;

interface I5{
    public String Method1(String x);
}

interface I6{
    public int Method2(int x, int y);
}

public class LambdaExpressionEg {
    public static void main(String[] args) {
        I5 obj1 = (a)->{
            System.out.println("Method with 1 parameter");
            System.out.println("String entered:  "+a);
            return a;
        };
        System.out.println(obj1.Method1("Kaleidoscope"));

        System.out.println("---------------------------");
        I6 obj2 = (a,b)->{
            System.out.println("Method with 2 parameters");
            System.out.println("a: "+a+"\nb: "+b);
            System.out.println("Addition of two numbers: "+(a+b));
            return 0;
        };
        System.out.println(obj2.Method2(12,13));
    }
}
