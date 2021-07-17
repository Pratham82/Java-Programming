package Day18;


public class AbstractClass {
    public static void main(String[] args) {
        //Implementation way 1 (Using parent class's  object):
        Mobile m = new OnePlus();
        m.Call();
        m.message();

        //Implementation way 2 (Using child class's object):
        OnePlus op = new OnePlus();
        op.Call();
        op.message();

        //Implementation way 3 (1st creating parents's class reference
        // and then create object of any class ):
        Mobile comm = null;
        comm = new OnePlus();
        comm.message();
        comm.Call();


    }
}
abstract class Mobile{
    //Abstract class can have both abstract method and concrete methods(Normal methods)
    //WHen we j
    abstract void Call();
    void message(){
        System.out.println("This is message method of Mobile class");
    }
}

class OnePlus extends Mobile{

    @Override  //This annotation is optional
    //When we extend a parent class then we have to give all the un-implemented methods
    //from parent and add body to it
    void Call() {
        System.out.println("This is call method is of OnePlus class ");
    }
}

abstract class Mi extends Mobile{

    //If we want to use MI class, we have to write the un-implemented methods of
    //parent class in here, nut if we don't want to use that method and
    // keep it as it is without any body then we should make our method an abstract method
    //And because of that we have to make our child class also an abstract class

    void  message(){
        System.out.println("This is call method is of Mi class");
   }
}

