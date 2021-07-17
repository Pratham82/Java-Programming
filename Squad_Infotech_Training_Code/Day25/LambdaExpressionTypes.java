package Day25;

interface I4{
    public void Method1(int a);
}

public class LambdaExpressionTypes {
    public static void main(String[] args){
        //implementation of lambda expression

        //Without method name
        I4 obj1 =(int b) -> { System.out.println("Type 1"); };
        obj1.Method1(12);

        //Without method name, data type
        I4 obj2 = (s)->{ System.out.println("Type 2"); };
        obj2.Method1(13);

        //Without method name, data type & parenthesis
        //This is only available if our method has only 1 local variable
        I4 obj3 = s ->{ System.out.println("Type 3"); };
        obj3.Method1(14);

        //Without method name, data type, parenthesis & curly braces
        //The first line will be printed after local variable
        I4 obj4 = s ->System.out.println("Type 4");
        obj4.Method1(15);
    }
}
