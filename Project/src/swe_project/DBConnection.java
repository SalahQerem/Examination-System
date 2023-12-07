
package swe_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    public static Connection getConnection()
    {
        Connection conn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/swe_db", "root", "0000");
        } 
        catch(ClassNotFoundException e){System.err.println("Class Not Found"); }
        catch (SQLException e) {
                System.err.println("SQL Exception: "+ e.toString());}
        
        return conn;
    }   
}
