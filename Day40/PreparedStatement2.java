package Day40;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatement2 {
    public static void main(String []args){

        //Creating variables to use in try block
        Connection con =null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String SQL;
        try{

            con  =DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_practice","root","root");
            //Register drivers
            Class.forName("com.mysql.jdbc.Driver");

            //Establish connection

            //Create prepared statement
            //taking Sql query through string
            SQL = "select * from UserDB;";
            ps = con.prepareStatement(SQL);

            //Executing query
            rs = ps.executeQuery();

            //printing table
            while(rs.next()){
                System.out.println(rs.getInt(1)+"|"+rs.getString(2));
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
