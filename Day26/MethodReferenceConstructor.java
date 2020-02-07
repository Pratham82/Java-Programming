package Day26;

interface Interface5{
    void InMethod1();
}

interface Interface6{
    void InMethod2(int f,int d);
}

class ChildClass{
    //non parameterized constructor
    ChildClass(){
        System.out.println("Constructor 1 without parameter");
    }

    //parameterized constructor
    ChildClass(int x, int y){
        System.out.println("Constructor 2 with two parameters");
        System.out.println("Addition of local variables: "+(x+y));
    }
}

public class MethodReferenceConstructor {
    public static void main(String[] args) {
        //Using method reference with constructors
        //It is similar object creation Eg. ChildCass cd = new ChildClass();
        //In normal object creation we use the new keyword which calls the constructor.
        //Method Reference Constructor: Interface6 obj2 = ChildClass::new;
        //Just like that in method reference we first write Classname:: and New keyword
        //the will call ChildClass's constructor.
        Interface5 obj1 = ChildClass::new;
        obj1.InMethod1();

        Interface6 obj2 = ChildClass::new;
        obj2.InMethod2(54,45);
    }
}
