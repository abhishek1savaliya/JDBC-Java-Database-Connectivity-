import java.sql.*;

public class practice {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhishek", "root","");
        Statement stmt = con.createStatement();
        String q = "SELECT * from data";
        ResultSet set =   stmt.executeQuery(q);
        while(set.next())
        {
           int x = set.getInt("Roll");
           String name = set.getString("Name");
           String marks = set.getString("Branch");  
           System.out.println(x+" "+name+"  "+marks);
        }

        stmt.close();
        con.close();
   
    }
}
