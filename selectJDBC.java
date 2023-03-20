import java.sql.*;

public class selectJDBC {
    public static void main(String[] args) throws Exception {
        Connection c = connectionProvider.getConnection();
        String q = "select * from table1";
        Statement stmt =   c.createStatement();
        ResultSet rs = stmt.executeQuery(q);
        while(rs.next()){
           int id =  rs.getInt(1);
           String name =  rs.getString(2);
           String city = rs.getString(3);

           System.out.println(id +" "+ name +" "+ city);

        }
        c.close();
        




    }
    
}
