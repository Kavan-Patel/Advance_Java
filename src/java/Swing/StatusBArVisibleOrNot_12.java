/*
 *  CopyRight @Kavan || do not use whole of any part of code 
 */
package Swing;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.SwingUtilities;

/**
 *
 * @author kavan
 */
public class StatusBArVisibleOrNot_12 extends JFrame {

    StatusBArVisibleOrNot_12() {
        initUI();
    }

    public void initUI() {
        JMenuBar jmb = new JMenuBar();
        JLabel status = new JLabel("This is states and This is visible if check box is clicked");
        JCheckBox cb = new JCheckBox("check box");
//        JMenu jmf=new JMenu();
//        JMenu jmv=new JMenu();

        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (status.isVisible()) {
                    status.setVisible(false);
                } else {
                    status.setVisible(true);
                }
            }
        });
//        jmb.add(jmf);
//        jmb.add(jmv);
        status.setVisible(false);
        status.setBorder(BorderFactory.createEtchedBorder(1000, Color.magenta, Color.yellow));

        setLayout(new GridLayout(2, 1));
        add(cb);
        add(status);
        setJMenuBar(jmb);
        setSize(555, 555);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                StatusBArVisibleOrNot_12 obj = new StatusBArVisibleOrNot_12();
                obj.setVisible(true);
            }
        });
    }
}
