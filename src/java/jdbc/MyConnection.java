/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kavan
 */
public class MyConnection {
    
    static Connection con=null;
    
    public MyConnection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Ins_Upd_Del(String str) throws SQLException
    {
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?user=root&password=YashvI@kp1997");
        Statement st=con.createStatement();
        st.executeUpdate(str);
        st.close();
        con.close();
    }
    static public ResultSet SelectData(String str) throws SQLException
    {
        ResultSet rs=null;
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?user=root&password=YashvI@kp1997");
        Statement st=con.createStatement();
        rs=st.executeQuery(str);
        return rs;
    }
    public void CloseConnection() throws SQLException
    {
        con.close();
    }
    public boolean CheckData(String str) throws SQLException
    {
        boolean b=false;
        
        ResultSet rs=SelectData(str);
        if(rs.next())
        {
            b=true;
        }
        CloseConnection();
        return b;
    }
}
