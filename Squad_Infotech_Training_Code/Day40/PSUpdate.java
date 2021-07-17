package Day40;

        import java.sql.PreparedStatement;

        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.util.Scanner;

public class PSUpdate {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        Connection con =null;
        PreparedStatement ps = null;
        String SQL;

        //Dynamic values
        int ID;
        String Name;
        /*Updating values statically
        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_practice","root","root");
            SQL = "update UserDB setName = 'User2' where ID = 102 ;";
            ps = con.prepareStatement(SQL);
            ps.executeUpdate();
            System.out.println("Row updated.");
        }catch(Exception e){
            e.printStackTrace();
        }
        */

        System.out.print("Enter new User name: ");
        Name = scan.next();
        System.out.print("Enter User ID: ");
        ID = scan.nextInt();
        //Updating values dynamically
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_practice","root","root");
            SQL= "update UserDB set Name =? where ID =?";
            ps = con.prepareStatement(SQL);
            ps.setString(1,Name);
            ps.setInt(2,ID);
            ps.executeUpdate();
            System.out.println("Row updated.");
        }catch(Exception e){
            e.printStackTrace();
        }
        scan.close();
    }
}
