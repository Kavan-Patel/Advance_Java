/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kavan
 */
public class Connecting_Database{
    public static void main(String[] args)  {
//        
//        ResultSet rs=SelectData("select * from marksheet");
//        ResultSetMetaData mtdt=rs.getMetaData();
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");      //load driver
           
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?user=root&password=YashvI@kp1997");   //get connection path with sql and give user id and password
            //jdbc:mysql://localhost:3306/name of database?user=username&password=your databasepassword
            Statement st=con.createStatement();
            String s="select * from marksheet";
            ResultSet rs=st.executeQuery(s);
            ResultSetMetaData mtdt=rs.getMetaData();
            
            for (int i = 1; i <=mtdt.getColumnCount(); i++) {
                if(!mtdt.getColumnName(i).equals("marksheetid"))
                {
                    System.out.print(mtdt.getColumnName(i).toUpperCase()+"\t\t");
                }
            }
            System.out.println("");
            while(rs.next())
            {
                for (int i = 1; i <=mtdt.getColumnCount(); i++) {
                    if(!mtdt.getColumnName(i).equals("marksheetid"))
                    {
                        System.out.print(rs.getString(i)+"\t\t");
                    }
                    
                }
                System.out.println("");
            }
             } catch (ClassNotFoundException ex) {
                Logger.getLogger(Connecting_Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connecting_Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
}
