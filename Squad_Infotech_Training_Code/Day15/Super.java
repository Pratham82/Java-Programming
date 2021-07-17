package Day15;
//Super class is immediate parent of the child class
public class Super {
    public static void main(String[] args) {
    Circle c = new Circle();  //When we create and object of Circle class the constructor of super class is automatically created
    System.out.println(c.name);
    }
}

class Shape{
    String name = "Shape var";
    // This is super class of Circle circle class
    Shape(){
        System.out.println("This is shape constructor");
    }
}

class Circle extends Shape{
    String name = "Circle var";

    Circle(){
        //For using the var of super class we use super.name
        System.out.println(super.name);
        System.out.println("This is circle constructor");
    }
}