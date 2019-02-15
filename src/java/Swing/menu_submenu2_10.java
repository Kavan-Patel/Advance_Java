package Swing;

//Author Kavan
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class menu_submenu2_10 extends JFrame implements ActionListener {
    //here we all manubar manubar is a manu which you see in first panel 
    //for ex in eclipse you can see at first line file Edit Source Refactor Navigate etc...whole panel is called jemanubar
    //in netbeans you can see at first line file edit view nevigate etc...whole panel is called jemanubar

    JMenuBar mb = new JMenuBar();

    //all the components of jmanubar is called jmenu... like file edit source refactor navigate in eclipse..
    JMenu jmfile = new JMenu("File");
    JMenu jmimp = new JMenu("IMP");
    JMenu jmheight = new JMenu("Height");
    JMenu jmwidth = new JMenu("Width");
    JMenu jmcolor = new JMenu("Color");
    JMenu edit = new JMenu("EDIT");
    JMenu edit1 = new JMenu("EDIT1");
    //if you click on file then you see come componenets like save open exit etc are call jmenuitem 
    //here is jmenuitem for File menu
    JMenuItem edit2 = new JMenuItem("EDIT2");
    JMenuItem jinew = new JMenuItem("new");
    JMenuItem jiopen = new JMenuItem("Open");
    JMenuItem jisave = new JMenuItem("SavE");
    JMenuItem jiexit = new JMenuItem("Exit");

    //here is jmenuitem for imp menu
    JMenuItem jibookmark = new JMenuItem("Import Bookmarks");
    JMenuItem jichat = new JMenuItem("Import Chat");
    JMenuItem jichase = new JMenuItem("Import Chase");

    //here is jmenuitem for height menu
    JMenuItem h300 = new JMenuItem("300");
    JMenuItem h600 = new JMenuItem("600");
    JMenuItem h900 = new JMenuItem("900");

    //for weidth menu
    JMenuItem w300 = new JMenuItem("300");
    JMenuItem w600 = new JMenuItem("600");
    JMenuItem w900 = new JMenuItem("900");

    //for color menu
    JMenuItem colred = new JMenuItem("Red");
    JMenuItem colblue = new JMenuItem("Blue");
    JMenuItem colgreen = new JMenuItem("Green");

    //here we make a constructor
    menu_submenu2_10() {
        initUI();
    }

    //here we make a method which is called in constructor
    public void initUI() {
        //when you drag your mouse on exit then you can see small menu in yellow color box so it is tool tip text 
        //here it is set on exit button
        jiexit.setToolTipText("For exit from application");

        /*here SetAccelerator is a methso of JMenuitem's class so we can use this method on the components of jmenuitem as like h300
         * h600 w300 you can see up side of program we can crate obj of jmenuitem
         * 
         * now keystroke is a class and getkeystroke is a method of keystroke class
         * here keyevent show the key and Actionevent is show another key for use action so here ctrl_mask 
         * is a ctrl key so when we press ctrl +x then jiexit.setAcc....vali line hongi
         * 
         * setAccelerator is work as a click but With keyboar 
         * if we click on color then click on red but instance of we can hold ctrl and then press r 
         * then setAccelerator method autometically click on colred object because we can use this method on colred 
         * so colred is clicked 
         * */
        jiexit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        colred.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        colblue.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        colgreen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));

        //setMnemonic is nothing but we can see the underline in some charactor in word
        //you can see some charactor in output there is underline for example there is new menuitem tnen in n we can see
        //underline
        jinew.setMnemonic(KeyEvent.VK_N);
        jiopen.setMnemonic(KeyEvent.VK_O);
        jisave.setMnemonic(KeyEvent.VK_E);
        jibookmark.setMnemonic(KeyEvent.VK_M);
        jichat.setMnemonic(KeyEvent.VK_C);
        jichase.setMnemonic(KeyEvent.VK_C);
        jiexit.setMnemonic(KeyEvent.VK_E);

        //here we can add some Menu on the Menubar
        mb.add(jmfile);
        mb.add(jmimp);
        mb.add(jmheight);
        mb.add(jmwidth);
        mb.add(jmcolor);

        mb.add(edit);
        edit.add(edit1);
        edit1.add(edit2);

        //then we can add Menuitems on Menu
        jmfile.add(jinew);
        jmfile.add(jiopen);
        jmfile.add(jisave);
        jmfile.addSeparator();
        jmfile.add(jiexit);

        jmimp.add(jibookmark);
        jmimp.add(jichase);
        jmimp.add(jichat);

        jmheight.add(h300);
        jmheight.add(h600);
        jmheight.add(h900);

        jmwidth.add(w300);
        jmwidth.add(w600);
        jmwidth.add(w900);

        jmcolor.add(colred);
        jmcolor.add(colblue);
        jmcolor.add(colgreen);

        //and at the end we can setmenubar on the frame
        setJMenuBar(mb);

        //here we give refrance for make a action on some components
        h300.addActionListener(this);
        h600.addActionListener(this);
        h900.addActionListener(this);
        w300.addActionListener(this);
        w600.addActionListener(this);
        w900.addActionListener(this);
        colred.addActionListener(this);
        colblue.addActionListener(this);
        colgreen.addActionListener(this);
        jibookmark.addActionListener(this);
        //here some basic operations
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setSize(500, 500);
        setVisible(true);

    }

    //our main method
    public static void main(String[] args) {
        //here swingutilite thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                menu_submenu2_10 obj = new menu_submenu2_10();
            }
        });
    }

    //here implementation of Actionlistener 
    @Override
    public void actionPerformed(ActionEvent e) {
        //make a event on some components
        if (e.getSource().equals(jiexit)) {
            System.exit(0);
        } else if (e.getSource().equals(colred)) {
            setBackground(Color.red);
        } else if (e.getSource().equals(colblue)) {
            setBackground(Color.blue);
        } else if (e.getSource().equals(colgreen)) {
            setBackground(Color.green);
        } else if (e.getSource().equals(h300)) {
            setSize(300, 300);
        } else if (e.getSource().equals(h600)) {
            setSize(300, 600);
        } else if (e.getSource().equals(h900)) {
            setSize(300, 900);
        } else if (e.getSource().equals(w300)) {
            setSize(300, 300);
        } else if (e.getSource().equals(w600)) {
            setSize(600, 300);
        } else if (e.getSource().equals(w900)) {
            setSize(900, 300);
        }

    }
}
//our program is end
