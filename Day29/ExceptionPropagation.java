package Day29;

class  ExceptionTest{
    int num1 =100;
    int num2 =0;

    //The list of methods is known as the call stack,
    // and the method of searching is Exception Propagation.
    //when an exception happens, Propagation is a process in which
    //the exception is being dropped from to the top to the bottom of the stack.
    public void SourceException(){
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        System.out.println("num1/num2: "+(num1/num2));
    }

    public void PropagatingMethod1(){
        SourceException();
    }
    public  void PropagatingMethod2(){
        try{
            PropagatingMethod1();
        }
        catch(ArithmeticException ae){
            System.out.println("ArithmeticException"+ae);
        }
    }
}

public class ExceptionPropagation {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        et.PropagatingMethod2();
    }
}
