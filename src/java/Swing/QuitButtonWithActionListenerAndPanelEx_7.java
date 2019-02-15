/*
 *  CopyRight @Kavan || do not use whole of any part of code 
 */
package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author kavan
 */
public class QuitButtonWithActionListenerAndPanelEx_7 extends JFrame {

    QuitButtonWithActionListenerAndPanelEx_7() {
        initUI();
    }

    public void initUI() {
        JPanel jp = new JPanel();
        jp.setLayout(null);
        getContentPane().add(jp);
        JButton jb = new JButton("quit");
        jb.setBounds(23, 23, 250, 250);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jp.add(jb);
        setTitle("quiteButton");
        setSize(666, 555);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                QuitButtonWithActionListenerAndPanelEx_7 obj = new QuitButtonWithActionListenerAndPanelEx_7();
                obj.setVisible(true);
            }
        });
    }
}
