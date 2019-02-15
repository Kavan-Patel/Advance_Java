/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author kavan
 */
public class Swing_second_example_2 extends JFrame {

    JFrame jfrm = new JFrame();
    JLabel jlb = new JLabel("hiii this is label");

    Swing_second_example_2() {
        jfrm.add(jlb);
        jfrm.setVisible(true);
        jfrm.setSize(300, 300);
        jfrm.setTitle("This is frame example of swing");
        jfrm.setDefaultCloseOperation(3);

    }

    public static void main(String[] args) {
        Swing_second_example_2 obj = new Swing_second_example_2();
        obj.setSize(500, 500);
      //  obj.setVisible(true);
//        jfrm.setVisible(true);
    }
}
