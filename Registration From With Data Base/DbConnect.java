import javax.swing.*;
import java.sql.*;
import java.sql.SQLException;
public class DbConnect {
    private Connection con;
    private Statement st;
    public DbConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","");
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
