/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author kavan
 */
public class FlowLayout_with_swingutilities_3 extends JFrame {

    void display() {
        JFrame jfrm = new JFrame("Swing Application");
        JLabel lb = new JLabel("This is label");
        JButton jbt = new JButton("OK");
        jfrm.add(lb);
        jfrm.add(jbt);
        jfrm.setSize(333, 333);
        jfrm.setDefaultCloseOperation(3);
        jfrm.setLayout(new java.awt.FlowLayout());
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FlowLayout_with_swingutilities_3 obj = new FlowLayout_with_swingutilities_3();
                obj.display();
            }
        });
    }
}
//swing utilities create special thread for swing 
//new runnable is a interface 
//void run is a method of swingutilities of the program
/*1. The main() method is started in the "main" thread.

2. The JRE's windowing subsystem, via SwingUtilities.invokeLater(), starts 3 threads at a time: "AWT-Windows" (daemon thread), "AWT-Shutdown" and "AWT-EventQueue-0". The "AWT-EventQueue-0" is known as the Event-Dispatching Thread (EDT), which is the one and only thread responsible for handling all the events (such as clicking of buttons) and refreshing the display to ensure thread safety in GUI operations and manipulating GUI components.

3. Then we step-into the constructor UnresponsiveUI()to run on the Event-Dispatching thread (created via invokeLater()), after all the existing events have been processed.

4. The "main" thread exits after the main() method completes.

5. A new thread called "DestroyJavaVM" is created.*/
