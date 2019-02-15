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
public class Update_In_Database_by_rollno_5 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?user=root&password=YashvI@kp1997");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the roll no for update name or marks");
        int rollno=sc.nextInt();
//        System.out.println("Enter new rollno");
//        int nrollno=sc.nextInt();
        System.out.println("Enter new name");
        String name=sc.next();
        System.out.println("Enter new maths marksh");
        int maths=sc.nextInt();
        System.out.println("Enter new science marks");
        int science=sc.nextInt();
        System.out.println("Enter new english marks");
        int english=sc.nextInt();
        Statement st=con.createStatement();
        //update (tabel name) set nrollno=34,name='yashvi,math=44,science=00099,english=99 where rollno=rollno
        int flag=st.executeUpdate("update marksheet set rollno="+rollno+",name='"+name+"',maths="
                + ""+maths+",science="+science+",english="+english+" where rollno="+rollno+";");
        if(flag==0)
        {
            System.out.println("Some error for updating");
        }
        else
        {
            System.out.println("Your update in marksheet is successfully done.....☻");
        }
    }
}
