/*
 *  CopyRight @Kavan || do not use whole of any part of code 
 */
package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

/**
 *
 * @author kavan
 */
public class RightClick_Menu_11 extends JFrame {

    RightClick_Menu_11() {
        initUI();
    }

    public void initUI() {
        JPopupMenu pm = new JPopupMenu("Components");
        JMenuItem mimax = new JMenuItem("Maximum");
        JMenuItem mimin = new JMenuItem("Minimum");
        JMenuItem miquit = new JMenuItem("Exit");

        mimax.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setExtendedState(MAXIMIZED_BOTH);
            }
        });
        mimin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setExtendedState(NORMAL);
            }
        });
        miquit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    pm.show(e.getComponent(), e.getX(), e.getY());
                }

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        pm.add(mimax);
        pm.add(mimin);
        pm.add(miquit);

        setTitle("Pop-up Menu");
        setSize(555, 555);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                RightClick_Menu_11 obj = new RightClick_Menu_11();
                obj.setVisible(true);
            }
        });
    }
}
