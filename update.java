import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class update {
    public static void main(String[] args) throws Exception{
        Connection c = connectionProvider.getConnection();
        String q = "update table1 set tName=? ,tcity=? where tId=?";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter New Name:");
        String name = br.readLine();
        System.out.println("Enter new city name:");
        String city = br.readLine();
        System.out.println("Enter the Student Id:");
        int id = Integer.parseInt(br.readLine());


        PreparedStatement pstmt = c.prepareStatement(q);
        pstmt.setString(1, name);
        pstmt.setString(2,city);
        pstmt.setInt(3, id);

        pstmt.executeUpdate();

        pstmt.close();
        c.close();



    }
}
