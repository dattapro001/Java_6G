import javax.swing.*;
import java.sql.*;
import java.sql.SQLException;
public class DbConnect {
    private Connection con;
    private Statement st;
    public DbConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root",""); //register is name of the Database
            st = con.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void InsertRegister(String insertQuery){

        try{
            st.executeUpdate(insertQuery);
            JOptionPane.showMessageDialog(null,"Successfully Registered");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Successfully Not Registered");
        }

    }
}
// Check Youtube or any video if you dont remember how to Connect with Database.
//Download mysql-connector-java-8.0.27 from google and the connect with it in eclipce in the project "JRE System Librery".
// Build path ->  configure bilt path -> then choice "Class path" from under -> Add External JRE -> Choice the "ysql-connector-java-8.0.27" -> Apply and Close.


