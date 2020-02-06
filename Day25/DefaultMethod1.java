package Day25;

interface I1{
    void AbstractMethod();

    //Default method
    //We can give method body in this method. This feature was added from JDK1.8 (8).
    //We can also override this method
    default void DefMethod(){
        System.out.println("Default method of interface");
    }
}

public class DefaultMethod1 implements I1 {
    public static void main(String[] args) {
        DefaultMethod1 dm = new DefaultMethod1();
        dm.AbstractMethod();
        dm.DefMethod();

    }

    public void DefMethod(){
        System.out.println("Overridden default method ");
    }
    @Override
    public void AbstractMethod() {
        System.out.println("Abstract method from interface");
    }
}
