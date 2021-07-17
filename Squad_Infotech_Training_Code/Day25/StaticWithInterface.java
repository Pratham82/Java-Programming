package Day25;

interface I2{
    //We cannot change the method body of static method
    //We can use it directly by just interface name.method name
    static void StaticMethod(){
        System.out.println("Static method of interface");
    }
}

public class StaticWithInterface implements I2{
    public static void main(String[] args) {
        I2.StaticMethod();
        StaticWithInterface si = new StaticWithInterface();
        si.StaticMethod();

    }

    //This is Static method of class, and it is different from method an interface.
    //It is not overriding Static method of Interface
    public void StaticMethod(){
        System.out.println("Static method of class");
    }

}
