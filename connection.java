import java.sql.*;
public class connection {
    public static void main(String[] args) {
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhishek", "root","");
                if(con.isClosed()){
                    System.out.println("Connection is Closed.");
                }
                else{
                    System.out.println("Connection is Created");
                }
        }         
        catch(Exception e){
            System.out.println(e);
        }
    }
}
