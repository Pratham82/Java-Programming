package Day40;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class PSDelete {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        Connection con = null;
        PreparedStatement ps = null;
        String SQL;

        int ID;

        System.out.println("Enter User ID to delete row:");
        ID = scan.nextInt();

        /*Deleting rows statically
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_practice","root","root");
            SQL = "delete from UserDB where ID = 102";
            ps = con.prepareStatement(SQL);
            ps.executeUpdate();
            System.out.println("Row deleted from table");
        }catch(Exception e){
            e.printStackTrace();
        }
        */

        //Deleting rows dynamically
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_practice","root","root");
            SQL = "delete from UserDB where ID =?";
            ps = con.prepareStatement(SQL);
            ps.setInt(1,ID);
            ps.executeUpdate();
            System.out.println("Row deleted from table");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
