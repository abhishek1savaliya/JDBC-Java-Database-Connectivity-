import java.sql.*;
import java.io.*;

public class preparedstmt {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/krishna", "root","");
        String q = "insert into table1(tName,tCity) values (?,?)";
        PreparedStatement pstmt = con.prepareStatement(q);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name:");
        String name = br.readLine();
        System.out.println("Enter City:");
        String city = br.readLine();

        pstmt.setString(1, name);
        pstmt.setString(2, city);
        pstmt.executeUpdate();
        System.out.println("Inserted.....");
        con.close();

    }
}
