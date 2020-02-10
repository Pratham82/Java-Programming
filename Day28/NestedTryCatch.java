package Day28;

public class NestedTryCatch {
    public void Multi(){
        int []A = new int [5];
        try{
            A[0] = 10;
            A[1] = 20;
            A[2] = 30;
            A[3] = 0;
            A[4] = 50;

            //Nested try catch block
            try{
                A[5] = A[2]/A[3];
            }
            catch (ArithmeticException ae ){
                System.out.println("ArithmeticException"+ae);
            }
            A[5] = A[2]/A[0];
        }
        //If we don't know which exception is we are going to get then we can use
        //"Multiple catches" or else "Exception" which is parent class of compile time and runtime exception
        //Multiple catch blocks will check if any of the block is matching the exception which is thrown in thw program
        catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("ArrayIndexOutOfBoundsException"+aie);
        }
        catch (ArithmeticException ae){
            System.out.println("ArithmeticException"+ae);
        }
        catch(RuntimeException re){
            System.out.println("RuntimeException"+re);
        }
        catch(Exception e){
            System.out.println("CompileTimeException"+e);
        }
    }
    public static void main(String[] args) {
        NestedTryCatch nc = new NestedTryCatch();
        nc.Multi();
    }
}
