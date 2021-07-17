package Day18;

public class InterfaceImplementation {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.drive();

        //For accessing the method of child class we have to
        //create reference of child class

        Car c = new Car();
        c.drive();
        c.park();

    }
}
interface Vehicle{
    //All the methods declared in Vehicle are abstract and default implicitly
    void drive();
}

class Car implements Vehicle{
    //As the show method in the vehicle is public then as per the method overriding rules
    //So the child's method should be less restrictive or same as the parents method
    //Or else we will get and error
        public void drive(){
            System.out.println("This is drive method");
        }
        void park(){
            System.out.println("This is park method");
        }
}


