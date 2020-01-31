package Day22;

public class StaticInnerClass {
    public static void main(String[] args) {

    //Object creation of outer class
    OuterClass o1 = new OuterClass();
    o1.InnerClassObjects();

    //Object creation of inner class:
    OuterClass.InnerClass ic1 = new OuterClass.InnerClass();
    ic1.MethodInner();
    
    //Directly calling inner class using static way
    OuterClass.InnerClass.MethodInnerStatic();

    }
}

class OuterClass{
    int OuterNum1 = 2312;
  static  int OuterNum2 = 2342;

    public void MethodOuter(){
        System.out.println("This is non static outer method");
    }

    public static void MethodOuterStatic(){
        System.out.println("This is static outer method");
    }

    //Inner class initialization
    static class InnerClass{
        int InNum1 =324;
   static int InNum2 =234;

        public void MethodInner(){
            System.out.println("This is non static inner method");
        }

        public static void MethodInnerStatic(){
            System.out.println("This is static inner method");
            //This will print outer class's static method
            MethodOuterStatic();
        }
    }

    //Creating object of inner class:
    InnerClass ic = new InnerClass();

    public void InnerClassObjects(){
        ic.MethodInner();
       InnerClass.MethodInnerStatic();
        System.out.println(InnerClass.InNum2);
    }

}
