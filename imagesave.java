import java.sql.*;
import java.io.*;

public class imagesave {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/krishna", "root","");
        String q = "insert into images(pic) values(?)";
        PreparedStatement pstmt = con.prepareStatement(q);
        FileInputStream fis = new FileInputStream("abc.jpeg");
         
        pstmt.setBinaryStream(1,fis,fis.available());
        pstmt.executeUpdate();
        System.out.println("Done");

    }
}
