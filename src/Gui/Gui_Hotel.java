/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.*;

public class Gui_Hotel extends JFrame {
    
    JPanel Userpanel;
    JButton book,back;
    JTextField texthotel;
    JTextArea textdesc;
    
    public Gui_Hotel(ArrayList<String> data, Gui_Main man)
    {
        setTitle("Admin");
        setSize(500,400);
        
        //intialize 
        
        Userpanel = new JPanel();
        texthotel = new JTextField(data.get(0));
        textdesc = new JTextArea(data.get(1));
        book = new JButton("Book");
        back = new JButton("Back");
        
        setLocation(500,280);
        Userpanel.setLayout (null); 
        
        // uneditable
        
        textdesc.setEditable(false);
        texthotel.setEditable(false);
        
        // location of items in frame
        
        texthotel.setBounds(20,150,100,20);
        textdesc.setBounds(150,150,270,100);
        book.setBounds(320,300,100,20);
        back.setBounds(150,300,100,20);
        
        //adding items to panel
        
        Userpanel.add(texthotel);
        Userpanel.add(textdesc);
        Userpanel.add(book);
        Userpanel.add(back);
        
        getContentPane().add(Userpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // go to reservation gui
        book.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Gui_Reservation resev = new Gui_Reservation(man);
                resev.setVisible(true);
                setVisible(false);
            }
        });
        
        // return to main gui
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                man.setVisible(true);
            }
        });
    }
}
