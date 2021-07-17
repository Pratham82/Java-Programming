package Day20;

//Importing all static methods from StaticCustom class using static import

import static Day20.StaticCustom.*;

public class StaticTest {
    public static void main(String[] args) {

    //These all are static methods (that's why we can use it without ref var)
    //And above we have already imported all the static methods that's why we also don't have to use a class name for calling that method
    Add(12,13);
    Multiply(10,4);
    Square(25);

    //Non static method
    //Unlike static methods for using non static methods we have to create an ref variable for object

    StaticCustom sc = new StaticCustom();
        sc.Show1("Var100");
        sc.Show2("Var1","Var2");


    }
}

