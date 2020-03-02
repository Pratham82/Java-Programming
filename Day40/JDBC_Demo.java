package Day40;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Demo {
    public static void main(String []args){
        try{
            //Register drivers
            Class.forName("com.mysql.jdbc.Driver");

            //Establish connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_practice","root","root");

            //Creating statement
            Statement stmt = con.createStatement();

            //Execute statement
            String sql = "select * from UserDB";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
