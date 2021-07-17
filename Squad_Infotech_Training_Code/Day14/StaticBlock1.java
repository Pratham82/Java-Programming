package Day14;

class Demo{
        static {
            System.out.println("This is static block 1");
        }
        static{
            System.out.println("This is static block 2");
        }
        Demo(){
            System.out.println("This is a Constructor");
        }
        static{
            System.out.println("This is static block 3");
        }

        }

public class StaticBlock1 {
    public static void main(String[] args) {
    Demo d =  new Demo();
    Demo d1 = new Demo();

    }
}

/*OP

This is static block 1   //Static block will be called at the time of class loading
This is static block 2
This is static block 3
This is a Constructor   //Constructor will be called at the time of object creation
This is a Constructor

* */