package Learn_OOP_in_Java.Access_modifiers;

public class MainClass {
    public static void main(String[] args) {
        Cop john = new Cop();

        // Accessing public field
        String copName = john.name;
        System.out.println(copName);

        // Accessing private field
        String gunName = john.getGun();
        System.out.println(gunName);

        // Changing private field
        john.setGun("NC23434");

        // Reassigning the value of gun
        String newGun = john.getGun();
        System.out.println(newGun);

    }
}

class Cop {
    private String gun = "MA876";
    public String name = "Officer John";

    public String getGun() {
        return this.gun;
    }

    public void setGun(String newGun) {
        gun = newGun;
    }
}
