package Day17;

public class HasARelationship {
    public static void main(String []args){
    Address ad = new Address(102,"Maharashtra","Mumbai",400060);
    Person p = new Person("Pratahmesh",22,ad);
        System.out.println(p);
    }
}

class Person{
    int Age;
    String Name;
    Address add;
    Person(String Name,int Age, Address add){
        this.Name = Name;
        this.Age =Age;
        this.add = add;
    }

    @Override
    public String toString() {
        return "Personal details: "+
                "Age=" + Age +
                ", Name='" + Name + '\'' +" "+
                 add +
                '}';
    }
}