/*
 *  CopyRight @Kavan || do not use whole of any part of code 
 */
package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author kavan
 */
public class QuiteButtonInContentplane_9 extends JFrame {

    QuiteButtonInContentplane_9() {
        initUI();
    }

    public void initUI() {
        JButton jb = new JButton("Click For Exit");
        getContentPane().add(jb);
        setSize(555, 555);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setVisible(true);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        QuiteButtonInContentplane_9 obj = new QuiteButtonInContentplane_9();

    }
}
