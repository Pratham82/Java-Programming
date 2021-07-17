package Day18;

public class NestedInterface {
    public static void main(String[] args) {
        childClass cc = new childClass();
        cc.inMethod();
        cc.outMethod();
    }
}

interface OuterInterface{
    void outMethod();
    interface InnerInterface{
        void inMethod();
    }
}
//Using method of outer interface: childClassName implements OuterInterfaceName
//Using method of inner interface: childClassName implements OuterInterfaceName.InnerInterfaceName
//Using method of both tht interfaces: childClassName implements OuterInterFaceName.InnerInterFace,OuterInterFace
class childClass implements OuterInterface.InnerInterface,OuterInterface{

    public void outMethod() {
        System.out.println("This is outer interface's method");
    }

    public void inMethod() {
        System.out.println("This is inner interface's method");
    }
}


