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
public class Serch_by_rollno_4 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        boolean flag=false;
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?user=root&password=YashvI@kp1997");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rollno which you serch");
        int rollno=sc.nextInt();
        
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from marksheet where rollno="+rollno+";");
        ResultSetMetaData mtdt=rs.getMetaData();
        while(rs.next())
        {
        flag=true;
        for (int i = 1; i <=mtdt.getColumnCount(); i++) {
            if(!mtdt.getColumnName(i).equals("marksheetid"))
            {
                System.out.print(mtdt.getColumnName(i).toUpperCase()+"\t\t");
            }
        }
        System.out.println("");
        for (int i = 1; i <=mtdt.getColumnCount(); i++) {
            if(!mtdt.getColumnName(i).equals("marksheetid"))
            {
                System.out.print(rs.getString(i)+"\t\t");
            }
        }
        }
        if(flag==false)
        {
            System.out.println("No data match to any rollno...");
        }
        con.close();
        rs.close();
        st.close();
    }
}
