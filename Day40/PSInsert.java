package Day40;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PSInsert {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        Connection con =null;
        PreparedStatement ps = null;
        String SQL;

        //Variables from SQL table
        int ID;
        String Name;

        /*//Inserting values statically
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_practice","root","root");
            ResultSet rs = null;

            Class.forName("com.mysql.jdbc.Driver");
            SQL = "insert into UserDB values(2,'User2');";
            ps =con.prepareStatement(SQL);
            ps.executeUpdate();
            System.out.println("Row inserted into table.");
        }catch(Exception e){
            e.printStackTrace();
        }*/

        //Taking user input
        System.out.print("Enter User ID: ");
        ID = scan.nextInt();
        System.out.print("Enter User Name: ");
        Name = scan.next();

        //Inserting values dynamically
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_practice","root","root");
            SQL ="insert into UserDB values(?,?)";
            ps = con.prepareStatement(SQL);
            ps.setInt(1,ID);
            ps.setString(2,Name);
            ps.executeUpdate();
            System.out.println("Row inserted into table");
        }catch(Exception e){
            e.printStackTrace();
        }
        scan.close();
    }
}
