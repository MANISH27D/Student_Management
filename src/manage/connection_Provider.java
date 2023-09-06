package manage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class connection_Provider {
    static Connection con;
    public static Connection createConnection(){
        //load the driver
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //create the connections
            String user="root";
            String password="1234";
            String url="jdbc:mysql://localhost:3306/student";

            con= DriverManager.getConnection(url,user,password);


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }
}
