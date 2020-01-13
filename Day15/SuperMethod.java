package Day15;

public class SuperMethod {
    public static void main(String[] args) {
    Circle1 c = new Circle1();
    c.showDetails();
    }
}

class Shape1{
    public void showDetails(){
        System.out.println("This is Shape method(Super class)");
    }
}
class Circle1 extends Shape1{
    public void showDetails(){
        //to print the showDetails method in superclass we will use super.showDetails()
        super.showDetails();
        System.out.println("This is circle method");
    }
}