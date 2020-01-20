package Day18;

public class FunctionalInterface {
    public static void main(String[] args) {
        class1 c1 = new class1();
        c1.eat();
    }
}

//Functional Interface is the interface with only one method
//If we want to our interface to follow functional interface's rule then we have to write
//@FunctionalInterface  annotation
@java.lang.FunctionalInterface
interface inter1{
    void eat();

}
class class1 implements inter1{
    public void eat(){
        System.out.println("This is eat method of class1");
    }
}

