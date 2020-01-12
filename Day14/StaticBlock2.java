package Day14;

public class StaticBlock2 {
    {
        System.out.println("This is Instance Initializer block 1");
    }
    static{
        System.out.println("This is Static block1");
    }
    {
        System.out.println("This is Instance Initializer block 2");
    }
    static{
        System.out.println("This is Static block2");
    }
    StaticBlock2(int ID){
        System.out.println("This is parametrized constructor");
    }
    StaticBlock2(){
        System.out.println("This is non parameterized constructor");
    }

    public static void main(String[] args) {
        StaticBlock2 sb = new StaticBlock2(15);
        StaticBlock2 sb1 = new StaticBlock2();
        StaticBlock2 sb2 = new StaticBlock2(25);
        StaticBlock2 sb3 = new StaticBlock2();

    }
}
/*
This is Static block1                     //Static block will be  called first ie at the time of class loading
This is Static block2
This is Instance Initializer block 1      //Instance Initializer block or anonymous block will be called when new object is created
This is Instance Initializer block 2
This is parametrized constructor          //Constructor will be called after IIB and object creation
This is Instance Initializer block 1
This is Instance Initializer block 2
This is non parameterized constructor
This is Instance Initializer block 1
This is Instance Initializer block 2
This is parametrized constructor
This is Instance Initializer block 1
This is Instance Initializer block 2
This is non parameterized constructor
* */