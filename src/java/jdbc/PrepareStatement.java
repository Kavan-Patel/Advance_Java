/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kavan
 */
public class PrepareStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?user=root&password=YashvI@kp1997");
            String sql="insert into marksheet (name,rollno,maths,science,english) values(?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, "yashvikavan");
            ps.setInt(2, 4223);
            ps.setInt(3, 2);
            ps.setInt(4, 2);
            ps.setInt(5, 2);
            ps.executeUpdate();
            PreparedStatement ps1=con.prepareStatement(sql);
            ps1.setString(1, "yashvi");
            ps1.setInt(2, 42);
            ps1.setInt(3, 23);
            ps1.setInt(4, 23);
            ps1.setInt(5, 23);
            ps1.executeUpdate();
            System.out.println("Record inserted");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PrepareStatement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PrepareStatement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
