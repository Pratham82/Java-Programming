package Learn_OOP_in_Java.Assessments;

public class Assessment {
    public static void main(String[] args) {
        GroceryList gc = new GroceryList();
        gc.insertItem("Onion");
        gc.insertItem("Garlic");
        gc.insertItem("Bread");
        gc.printList();
    }
}

class GroceryList {
    //Declare member variables here
    private int numberOfItems;
    private String[] items;

    public GroceryList() {
        //Add necessary initializations here
        this.numberOfItems = 20;
        this.items = new String[20];
    }

    public void insertItem(String item) {
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] == null) {
                this.items[i] = item;
                break;
            }
        }
    }


    public void printList() {
        //Add function logic
        for (String item : this.items) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }
}


class Patient {
    //Declare member variables here
    String name, doctor;
    int id;

    //Declare Getters and Setters here

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
