import java.sql.*;
public class connectionProvider {
    private static Connection con;

    public static Connection getConnection() throws Exception{
    
            if(con==null){
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/krishna", "root","");
                return con;
            }
            else{
                
                return con;
            }
    }

}
