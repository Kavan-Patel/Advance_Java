/*
 *  CopyRight @Kavan Patel || do not use whole of any part of code 
 */
package Awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kavan
 */
public class FirstExample_1 extends Frame{
    Label lbn=new Label("User Name");
    TextField tfn=new TextField(11);
    Label lbp=new Label("Password");
    TextField tfp=new TextField(11);
    Button bts=new Button("Show");
    Label lbs=new Label("new");
    FlowLayout f=new FlowLayout();
    FirstExample_1()
    {
        setLayout(f);
        add(lbn);
        add(tfn);
        add(lbp);
        add(tfp);
        add(bts);
        add(lbs);
        
        
        bts.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               if(e.getSource()==bts)
               {
                   lbs.setText(tfn.getText());
               }
            }
        });
        
    }
    
    
  
    public static void main(String[] args) {
        FirstExample_1 obj=new FirstExample_1();
        obj.setSize(500, 500);
        obj.show();
    }
    
}    

