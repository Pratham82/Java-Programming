package Day28;

public class RunTimeException1 {
    public static void main(String[] args) {
        int num1 = 120;
        int num2 = 0;
        try{
            System.out.println("num1: "+num1);
            System.out.println("num2: "+num2);
            System.out.println("num1/num2: "+(num1/num2));
        }
        catch(ArithmeticException ae){
            System.out.println("ArithmeticException"+ae);
        }
    }
}
