package Day26;

interface Interface1{
    void InMethod();
}

interface Interface2{
    void InMethod2(int x, int y);
}

public class MethodReference {
    public void ClassMethod(){
        System.out.println("This is class's method 1");
    }

    public void ClassMethod2(int d, int e){
        System.out.println("THis is class's method 2");
        System.out.println("Local variable d: "+d);
        System.out.println("Local variable e: "+e);
        System.out.println("d + e: "+(d+e));
    }

    public static void main(String[] args) {
        //Creating object of class
        MethodReference mr = new MethodReference();

        //Implementing method with Lambda expression
        Interface1 i1 = () -> {mr.ClassMethod();};
        i1.InMethod();

        //Implementing using method reference
        //THis reduces the method parenthesis and arrow we just have to use reference variable and method name
        Interface1 i11 = mr::ClassMethod;
        i11.InMethod();

        //Implementing method reference with two parameters
        Interface2 i2 = mr::ClassMethod2;
        i2.InMethod2(45,65);
    }
}
