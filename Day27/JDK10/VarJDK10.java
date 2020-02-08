package Day27.JDK10;

public class VarJDK10 {
    public static void main(String[] args) {
        //In JDK10 var data type is added. We can instantiate any data type using var type.
        var var1 = 546;
        var var2 = "String1";

        for(var i=1; i<=10; i++){
            System.out.println("Iteration no."+i);
        }
    }
}
