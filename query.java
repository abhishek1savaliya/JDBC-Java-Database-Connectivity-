import java.sql.*;
public class query {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/krishna", "root","");
        String q = "create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null,tCity varchar(400))";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(q);
        System.out.println("Table Created in Database");
        con.close();
        stmt.close();
    }
}
