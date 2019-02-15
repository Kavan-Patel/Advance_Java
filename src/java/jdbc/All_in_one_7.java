/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package jdbc;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author kavan
 */
public class All_in_one_7 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        MyConnection con=new MyConnection();
        Scanner sc=new Scanner(System.in);
        
        int d = 0;
        do{
            ResultSet rs=con.SelectData("select * from marksheet");
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
        System.out.println("1.Select");
        System.out.println("2.Insert");
        System.out.println("3.Update");
        System.out.println("4.Delete");
        System.out.println("5.Exit");
            System.out.print("Enter your choice::");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.print("Enter rollno which you want to select:");
                int rollno=sc.nextInt();
                ResultSet rsselect=con.SelectData("select * from marksheet where rollno="+rollno);
                ResultSetMetaData mtdts=rsselect.getMetaData();
                for (int i = 1; i <=mtdts.getColumnCount(); i++) {
                     if(!mtdts.getColumnName(i).equals("marksheetid"))
                        {
                            System.out.print(mtdts.getColumnName(i).toUpperCase()+"\t\t");
                        }
                }
                System.out.println("");
                while(rsselect.next())
                {
                    for (int i = 1; i <=mtdts.getColumnCount(); i++) {
                        if(!mtdts.getColumnName(i).equals("marksheetid"))
                        {
                            System.out.print(rsselect.getString(i)+"\t\t");
                        }
                    }
                    System.out.println("");
                }
                break;
            }
            case 2:
            {
                System.out.println("Enter The Details of new entry");
                System.out.println("Enter Rollno");
                int rollno=sc.nextInt();
                System.out.println("Enter Name");
                String name=sc.next();
                System.out.println("Enter Maths");
                int maths=sc.nextInt();
                System.out.println("Enter Science");
                int science=sc.nextInt();
                System.out.println("Enter English");
                int english=sc.nextInt();
                con.Ins_Upd_Del("insert into marksheet (rollno,name,maths,science,english)values("+rollno+",'"+name+"',"+maths+","+science+","+english+")");
                break;
            }
            case 3:
            {
                System.out.println("Enter The rollno which you want to update");
                int rollno=sc.nextInt();
                System.out.println("Enter new name");
                String name=sc.next();
                System.out.println("Enter new maths marks");
                int maths=sc.nextInt();
                System.out.println("Enter new science marks");
                int science=sc.nextInt();
                System.out.println("Enter new english marks");
                int english=sc.nextInt();
                con.Ins_Upd_Del("update marksheet set rollno="+rollno+",name='"+name+"',maths="+maths+",science="+science+",english="+english+" where rollno="+rollno);
                break;
            }
            case 4:
            {
                System.out.println("Enter The rollno which you want to delete");
                int rollno=sc.nextInt();
                con.Ins_Upd_Del("delete from marksheet where rollno="+rollno);
                break;
            }
            case 5:
            {
                System.out.println("Enter 1 for exit");
                d=sc.nextInt();
                break;
            }
            default:
                    {
                        System.out.println("Invalid choice");
                    }
        }
        
        }while(d==0);
    }
}
