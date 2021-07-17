package Day18;

public class ExtendedInterface {
    public static void main(String[] args) {
        Class1 c1 = new Class1();
        c1.method1();
        c1.method2();
    }
}

interface IF1{
    void method1();
}

interface IF2 extends IF1{
    void method2();
}

//When we are extending a parent interface and if that interface is also extending another
//parent interface then we must add the parents unimplemented methods to the child class
class Class1 implements IF2{

    @Override
    public void method1() {
        System.out.println("This is method 1");
    }

    @Override
    public void method2() {
        System.out.println("This is method 2");
    }
}
