/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import javax.swing.*;

/**
 *
 * @author kavan
 */
public class initUI_method_with_frame_6 extends JFrame {

    initUI_method_with_frame_6() {
        initUI();
    }

    void initUI() {
        JFrame frm = new JFrame();
        frm.setSize(333, 333);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
        frm.setTitle("Sample example");
        setVisible(true);
        setLocationRelativeTo(frm);
        setDefaultCloseOperation(3);
        setSize(333, 333);
        setTitle("This is original frame");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                initUI_method_with_frame_6 obj = new initUI_method_with_frame_6();

            }
        });
    }
}
