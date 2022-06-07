/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import travel.*;
/**
 *
 * @author Ahmed
 */
public class Gui_User extends JFrame{
    
    JButton Save,Edit,Edit1,Edit2,back;
    JPanel Userpanel;
    JTextField txuser;
    JTextField txemail;
    JPasswordField pass;
    JLabel username;
    JLabel email;
    JLabel password;
    public Gui_User(Gui_Main main, Accounts account){
        setTitle("Account setting");
        setSize(400,250);
        
        //intialize 
        
        Save = new JButton("Save");
        back = new JButton("Back");
        Edit = new JButton("Edit");
        Edit1 = new JButton("Edit");
        Edit2 = new JButton("Edit");
        Userpanel = new JPanel();
        txuser = new JTextField(15);
        txuser.setText(account.GetFullname());
        txemail = new JTextField(30);
        txemail.setText(account.getMail());        
        pass = new JPasswordField(15);
        username = new JLabel("Name  ");
        email = new JLabel("Email  ");
        password = new JLabel("Password  ");
        setLocation(500,280);
        Userpanel.setLayout (null); 
        
        
        // location of items in frame
        
        txuser.setBounds(100,30,170,20);
        txemail.setBounds(100,65,170,20);
        pass.setBounds(100,100,170,20);
        username.setBounds(20,28,80,20);
        email.setBounds(20,63,80,20);
        password.setBounds(20,98,80,20);
        Save.setBounds(190,155,80,20);
        back.setBounds(100,155,80,20);
        Edit.setBounds(290,30,80,20);
        Edit1.setBounds(290,65,80,20);
        Edit2.setBounds(290,100,80,20);
        
        //set fields disable
        
        txuser.setEditable(false);
        txemail.setEditable(false);
        pass.setEditable(false);
         
        //adding items to panel
        
        Userpanel.add(Save);
        Userpanel.add(back);
        Userpanel.add(txuser);
        Userpanel.add(txemail);
        Userpanel.add(pass);
        Userpanel.add(username);
        Userpanel.add(email);
        Userpanel.add(password);
        Userpanel.add(Edit);
        Userpanel.add(Edit1);
        Userpanel.add(Edit2);
        
        getContentPane().add(Userpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // action listener 
        
        Save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                main.setVisible(true);
            }
        });        
        Edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                txuser.setEditable(true);
            }
        });
        
        Edit1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                txemail.setEditable(true);
            }
        });
        Edit2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pass.setEditable(true);
            }
        });
    }
}
