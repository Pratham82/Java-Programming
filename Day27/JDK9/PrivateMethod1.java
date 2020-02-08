package Day27.JDK9;

interface Interface1{
    default void DefMethod(){
        System.out.println("This is normal default method");
    }

    //Private method
    //From JDK 9 we can use private method in an interface, and we can run it by using with default method
    private void PrivateMethod1(){
        System.out.println("This is private method");
    }

    default  void PrivateRunner(){
        /*
        In previous JDK 9 we have to use return with Private Method for running private method
        return PrivateMethod1();
         */
        PrivateMethod1();
    }
}

public class PrivateMethod1 implements Interface1{
    public static void main(String[] args) {

        Interface1 i1 = new PrivateMethod1();
        i1.DefMethod();
        i1.PrivateRunner();
    }
}
