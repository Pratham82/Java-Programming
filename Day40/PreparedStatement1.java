package Day40;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatement1 {
    public static void main(String []args){
       try{
           //Registering drivers
           Class.forName("com.mysql.jdbc.Driver");

           //Establish connection
           Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_practice","root","root");

           //Create prepared statement
           String sql = "select * from UserDB";
           PreparedStatement ps = con.prepareStatement(sql);

           //Executing statement
           ResultSet rs = ps.executeQuery();

           while(rs.next()){
               System.out.println(rs.getInt(1)+"|"+rs.getString(2));
           }
       }catch(Exception e){
           e.printStackTrace();
       }
    }
}
