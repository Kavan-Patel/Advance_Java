/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/**
 *
 * @author kavan
 */
public class Insert_IN_Database_3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?user=root&password=YashvI@kp1997");
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Roll No::");
        int rollno=sc.nextInt();
        System.out.println("Enter the Name::");
        String name=sc.next();
        System.out.println("Enter the marks of Maths::");
        int maths=sc.nextInt();
        System.out.println("Enter the marksh of Science::");
        int science=sc.nextInt();
        System.out.println("Enter the marks of English");
        int english=sc.nextInt();
        
        
        Statement st=con.createStatement();
        //insert into (tablename) (metadata)values(45,'yashvi',34,45,56);
        String s="insert into marksheet (rollno,maths,science,english)values("+rollno+",'"+name+"',"+maths+","+science+","+english+")";
        
        int effectrow=st.executeUpdate(s);
        System.out.println(effectrow);
        if(effectrow==0)
        {
            System.out.println("Some problem while inserting data plese insert again☻");
        }
        else
        {
            System.out.println("Record successfully inserted....☻");
        }
        st.close();
        con.close();
        
    }
}
