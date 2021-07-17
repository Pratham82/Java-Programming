package Day27;

import java.util.function.Consumer;

class ChildClass1 implements Consumer {

    //method without datatype object o as a parameter
    @Override
    public void accept(Object o) {
        System.out.println("Accept method of interface ");
    }

    //method with datatype
    public void accept(Integer LocalInt) {
        System.out.println("Method with an integer: "+LocalInt);
    }

}

public class ConsumerInterface1 {
    public static void main(String[] args) {
        //Using consumer interface with class
        ChildClass1 cc = new ChildClass1();
        Object o =456;
        cc.accept(o);

        //Applying using method reference
        Consumer< Object > co2= cc::accept;

        //Using consumer interface directly, using lambda expression
        Consumer< Object > co= LocalVar -> System.out.println("Accept method implementing directly");
        co.accept(o);

        //Method with data type implementing using class
        cc.accept(54);

        //Method with data type implementing directly
        Consumer<Integer> Cref1 = LocalInt ->System.out.println("directly using Method with an integer: "+LocalInt);
        Cref1.accept(465);

    }

}
