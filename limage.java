import java.sql.*;
import java.io.*;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class limage {
    public static void main(String[] args)throws Exception {
      Connection c = connectionProvider.getConnection();
      String q = "insert into images (pic) values(?)";
      PreparedStatement pstmt = c.prepareStatement(q);
      JFileChooser jfc = new JFileChooser();
      jfc.showOpenDialog(null);
      File file = jfc.getSelectedFile();
      FileInputStream fis = new FileInputStream(file);
      pstmt.setBinaryStream(1, fis,fis.available());
      pstmt.executeUpdate();
    //   System.out.println("Done");

    JOptionPane.showMessageDialog(null,"Success");
      
    }
}
