// Import packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// For database Connectivity
public class DatabaseConn {

    public static Connection getConnection() throws ClassNotFoundException {
        Connection conn = null;
        // exception Handling
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaySystem?zeroDateTimeBehavior=convertToNull", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conn;
    }

}
