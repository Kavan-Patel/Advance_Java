/*
 *  CopyRight @ykcode || do not use whole of any part of code 
 */
package Swing;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 *
 * @author kavan
 */

public class Combobox_13 extends JDialog implements ActionListener, ItemListener {

    final String[] name = {"Car1", "Car2"};
    final String[] photos = {"1.jpg", "2.jpg"};

    JLabel label = null;
    JComboBox combo = null;
    JButton btn = null;

    public void comboboxx() {
        
        Combobox_13 obj = new Combobox_13();
        
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(Box.createRigidArea(new Dimension(0, 35)));
        label = new JLabel();
        label.setPreferredSize(new Dimension(300, 325));
        label.setMaximumSize(new Dimension(300, 325));
        label.setMinimumSize(new Dimension(300, 325));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setBorder(LineBorder.createGrayLineBorder());
        add(label);
        add(Box.createRigidArea(new Dimension(0, 15)));

        combo = new JComboBox(name);
        combo.setSelectedIndex(-1);
        combo.setPreferredSize(new Dimension(140, 22));
        combo.setMaximumSize(new Dimension(140, 22));
        combo.addItemListener(this);
        add(combo);

        add(Box.createRigidArea(new Dimension(0, 15)));
        btn = new JButton("close");
        btn.setAlignmentX(CENTER_ALIGNMENT);
        btn.addActionListener(this);
        add(btn);
        add(Box.createRigidArea(new Dimension(0, 15)));

        setTitle("JComboBox");
        setSize(555, 555);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }

    public static void main(String[] args) {
        Combobox_13 obj = new Combobox_13();
        obj.comboboxx();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            int index = combo.getSelectedIndex();
            label.setIcon(new ImageIcon(
                    ClassLoader.getSystemResource(photos[index])));
        }
    }
}
