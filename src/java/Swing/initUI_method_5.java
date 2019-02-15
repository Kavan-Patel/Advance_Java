/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import javax.swing.SwingUtilities;
import javax.swing.*;

/**
 *
 * @author kavan
 */
public final class initUI_method_5 extends JFrame {

    initUI_method_5() {
        initUI();
    }

    void initUI() {
        setTitle("This is simple initui method example");
        setSize(333, 555);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                initUI_method_5 obj = new initUI_method_5();
            }
        });
    }
}
