/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author kavan
 */
public class eventqueue_invokelater_4 extends JFrame {

    eventqueue_invokelater_4() {
        setTitle("This is simple example");
        setSize(333, 333);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
//        setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                eventqueue_invokelater_4 obj = new eventqueue_invokelater_4();
                obj.setVisible(true);
            }
        });
    }
}
/*The complete Swing processing is done in a thread called EDT (Event Dispatching Thread). Therefore you would block the GUI if you would compute some long lasting calculations within this thread.

The way to go here is to process your calculation within a different thread, so your GUI stays responsive. At the end you want to update your GUI, which have to be done within the EDT. Now EventQueue.invokeLater comes into play. It posts an event (your Runnable) at the end of Swings event list and is processed after all other GUI events are processed.

Also the usage of EventQueue.invokeAndWait is possible here. The difference is, that your calculation thread blocks until your GUI is updated. This must not be used from the EDT.

Be careful not to update your Swing GUI from a different thread. In most cases this produces some strange updating/refreshing issues.

Still there is Java code out there that starts a JFrame simple from the main thread. This could cause issues, but is not prevented from Swing. Most modern IDEs now create something like this to start the GUI:*/
