/*
 *  CopyRight @Kavan || do not use whole of any part of code 
 */
package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author kavan
 */
public class QuiteButtonInFrame_8 extends JFrame {

    QuiteButtonInFrame_8() {
        initUI();
    }

    public void initUI() {
        JFrame frm = new JFrame();
        JButton jb = new JButton("Quit");
        jb.setBounds(30, 30, 200, 200);
        frm.setSize(555, 666);
        frm.setDefaultCloseOperation(3);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        frm.add(jb);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                QuiteButtonInFrame_8 obj = new QuiteButtonInFrame_8();
            }
        });
    }
}
