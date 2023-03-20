import java.sql.*;

public class p2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // DriverManager.registerDriver(new com.mysql.jdbc.Driver()); //optional for first line
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhishek", "root","");
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * from data");
            while(rs.next()){
                System.out.print(rs.getInt("Roll") + "\t");
                System.out.print(rs.getString("Name") + "\t"); 
                System.out.println(rs.getString("Branch"));
            }
          PreparedStatement stmt2 =conn.prepareStatement("INSERT INTO data VALUES(?,?,?)");  
          stmt2.setInt(1,105);        
          stmt2.setString(2,"Krishna");
           stmt2.setString(3, "EC");
            
            int update = stmt2.executeUpdate();
           System.out.println(update + " Row affected");
          
            stmt.close();
            conn.close();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }

}
