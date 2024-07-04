
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

//Database Connection
public class db {
    
    public static Connection conn(){
        Connection con = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/OinkBank","admin","admin");
        }catch (SQLException e){
            System.err.println("Error connection to databse: " + e.getMessage());
        }catch (ClassNotFoundException e){
            System.err.println("MySQL JDBC Driver not found.");
        }
        
        return con;
    }
    
    public void updateBalance(String accNum, int withdrawalAmount) throws SQLException {
    try (Connection con = conn();
         PreparedStatement stmt = con.prepareStatement("UPDATE customer SET current_balance = current_balance - ? WHERE acc_no = ?")) {
        stmt.setInt(1, withdrawalAmount);
        stmt.setString(2, accNum);
        stmt.executeUpdate();
    }
}
    
    public void updateB(String accNum, int depositAmount) throws SQLException {
    try (Connection con = conn();
        PreparedStatement stmt = con.prepareStatement("UPDATE customer SET current_balance = current_balance + ? WHERE acc_no = ?")) {
        stmt.setInt(1, depositAmount);
        stmt.setString(2, accNum);
        stmt.executeUpdate();
    }
}
}
