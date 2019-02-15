/*
 *  CopyRight @Kavan || do not use whole of any part of code 
 */
package Swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author kavan
 */
public class ProgressBar_14 extends JFrame {

    JProgressBar progressbar = null;
    Timer timer = null;

    ProgressBar_14() {
        initUI();
    }

    public void initUI() {
        setTitle("Progress bar");
        JPanel jp = new JPanel();
        jp.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
        jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
        progressbar = new JProgressBar(0, 100);
        progressbar.setMaximumSize(new Dimension(150, 20));
        progressbar.setMinimumSize(new Dimension(150, 20));
        progressbar.setPreferredSize(new Dimension(150, 20));
        progressbar.setForeground(Color.black);
        progressbar.setAlignmentX(0);
        jp.add(progressbar);
        jp.add(Box.createRigidArea(new Dimension(0, 20)));
        JButton button = new JButton("Start");
        button.setFocusable(false);
        button.setMaximumSize(button.getPreferredSize());
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int val = progressbar.getValue();
                if (val >= 100) {
                    timer.stop();
                    button.setText("End");
                    return;
                }
                progressbar.setValue(++val);
            }
        };
        timer = new Timer(550, actionListener);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (timer.isRunning()) {
                    timer.stop();
                    button.setText("Start");
                } else if (!"End".equals(button.getText())) {
                    timer.start();
                    button.setText("Stop");
                } else if ("End".equals(button.getText())) {
                    System.exit(0);
                }
            }
        });
        jp.add(button);
        add(jp);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ProgressBar_14 obj = new ProgressBar_14();
                obj.setVisible(true);
            }
        });
    }
}
