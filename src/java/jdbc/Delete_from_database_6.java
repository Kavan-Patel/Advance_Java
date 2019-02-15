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
import java.util.Scanner;

/**
 *
 * @author kavan
 */
public class Delete_from_database_6 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?user=root&password=YashvI@kp1997");
        
      
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from marksheet");
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
            for (int i = 1; i <=mtdt.getColumnCount(); i++) 
            {
                if(!mtdt.getColumnName(i).equals("marksheetid"))
                {
                    System.out.print(rs.getString(i)+"\t\t");
                }
            }
            System.out.println("");
        }
        
        System.out.print("Enter The Rollno Which you Want to delete :: ");
        Scanner sc=new Scanner(System.in);
        int rollno=sc.nextInt();
        //s=delete from (tablename) where rollno=44;
        int rsroll=st.executeUpdate("delete from marksheet where rollno="+rollno+";");
        
        if(rsroll==0)
        {
            System.out.println("Some Error while deleting your data plz try again//");
        }
        else
        {
            System.out.println("Your Data is successfully delete ....☻");
        }
    }
}
