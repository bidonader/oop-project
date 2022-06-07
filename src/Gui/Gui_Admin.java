/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
/**
 *
 * @author Ahmed
 */
public class Gui_Admin extends JFrame{

    

    
    JButton Save,remove,Add,addhotel,remove1,back;
    JPanel Userpanel;
    JComboBox<String> txhotel;
    JTextField texthotel;
    JLabel Hotels;
    JLabel Hotelname;
    JLabel hoteldesc;
    JComboBox<String> txUser;
    JTextField textuser;
    JTextArea textdesc;
    JLabel Users;
    JLabel Username;
    
    public Gui_Admin(Gui_Main main) {
        setTitle("Admin");
        setSize(500,400);
                
        //intialize 
        
        Save = new JButton("Add");
        back = new JButton("Back");
        remove = new JButton("Remove");
        Add = new JButton("Add Hotel");
        addhotel = new JButton("Add");
        Userpanel = new JPanel();
        txhotel= new JComboBox<String>();
        texthotel = new JTextField(30);
        Hotels = new JLabel("Hotels  ");
        Hotelname = new JLabel("Hotel name  ");
        hoteldesc = new JLabel("Hotel Desc");
        textdesc = new JTextArea();
        
        setLocation(500,280);
        Userpanel.setLayout (null); 
        
        //adding hotels to ddl
        
        
        
        // location of items in frame
        
        txhotel.setBounds(150,30,270,20);
        Add.setBounds(290,75,170,20);
        Hotels.setBounds(20,28,80,20);
        Save.setBounds(300,300,80,20);
        back.setBounds(200,300,80,20);
        remove.setBounds(100,75,170,20);
        Hotelname.setBounds(20,125,80,20);
        texthotel.setBounds(150,125,270,20);
        textdesc.setBounds(150,170,270,100);
        hoteldesc.setBounds(20,170,80,20);
        
        // not visible
        
        Hotelname.setVisible(false);
        texthotel.setVisible(false);
        textdesc.setVisible(false);
        hoteldesc.setVisible(false);
         
        //adding items to panel
        
        Userpanel.add(Save);
        Userpanel.add(back);
        Userpanel.add(txhotel);
        Userpanel.add(texthotel);
        Userpanel.add(Hotels);
        Userpanel.add(Hotelname);
        Userpanel.add(remove);
        Userpanel.add(Add);
        Userpanel.add(textdesc);
        Userpanel.add(hoteldesc);
        
        
        getContentPane().add(Userpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                main.setVisible(true);
            }
        });

        
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Hotelname.setVisible(true);
                texthotel.setVisible(true);
                textdesc.setVisible(true);
                hoteldesc.setVisible(true);
            }
        });
    }
    
}
