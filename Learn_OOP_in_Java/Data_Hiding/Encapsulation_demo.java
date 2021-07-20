package Learn_OOP_in_Java.Data_Hiding;

class User {
    private String userName, password;

    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public void login(String userName, String password){
        if(userName.equalsIgnoreCase(this.userName) && password.equals(this.password)){
            System.out.println("Login Successful, Credentials matched");
        }else{
            System.out.println("Login Failed, Credentials does not match");
        }
    }
}

public class Encapsulation_demo {
    public static void main(String[] args) {
        User u1 = new User("Prathamesh","12345");
        u1.login("Joe","123");
        u1.login("Prathamesh","12345");
        //u1.password = "222"; // This will throw error because, password is private variable

    }
}
