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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import travel.*;

public class Gui_Creditcard extends JFrame implements files{
    
    JButton Save,back;
    JPanel Userpanel;
    JTextField textcard;
    JTextField textcountry;
    JTextField textcvv;
    JTextField textdate;
    JLabel card;
    JLabel country;
    JLabel cvv;
    JLabel date;
    
    public void read(){}
    public void update() {}
    public void write(String saveData) {
        try {
            String str = "Hello";
            File file = new File("C:\\Users\\M. HAWASH\\Desktop\\oop-project\\src\\Gui\\credit.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            PrintWriter pr = new PrintWriter(writer);
            pr.println(saveData);
            writer.close();
            pr.close();
        } catch (IOException e) {
            
        }
    }
    
    public Gui_Creditcard() {
        setTitle("Credit card");
        setSize(400,250);
                
        //intialize 
        
        Save = new JButton("Save");
        back = new JButton("back");
        Userpanel = new JPanel();
        card = new JLabel("Card Num");
        country = new JLabel("Country");
        cvv = new JLabel("CVV");
        date = new JLabel("Date");
        textcard = new JTextField();
        textcountry = new JTextField();
        textcvv = new JTextField();
        textdate = new JTextField();
        
         
        setLocation(500,280);
        Userpanel.setLayout (null); 
        
        // location of items in frame
        
        Save.setBounds(270,150,100,20);
        back.setBounds(100,150,100,20);
        textcard.setBounds(100,30,270,20);
        textcvv.setBounds(100,65,80,20);
        textdate.setBounds(290,65,80,20);
        textcountry.setBounds(100,100,270,20);
        card.setBounds(20,30,80,20);
        cvv.setBounds(20,65,80,20);
        date.setBounds(220,65,80,20);
        country.setBounds(20,100,80,20); 
        //adding items to panel
        
        Userpanel.add(Save);
        Userpanel.add(back);
        Userpanel.add(textcard);
        Userpanel.add(textcountry);
        Userpanel.add(textcvv);
        Userpanel.add(textdate);
        Userpanel.add(card);
        Userpanel.add(country);
        Userpanel.add(cvv);
        Userpanel.add(date);
        
        
        getContentPane().add(Userpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //return to payment GUI and save to file
        Save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
           if(textcard.getText().equals("")||textcountry.getText().equals("")||textcvv.getText().equals("")||textdate.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Please Fill All Of Your Info", "Error" , JOptionPane.INFORMATION_MESSAGE);   
            
            }
           else{  
                    String cards = textcard.getText();
                    String cvvs = textcvv.getText();
                    String countrys = textcountry.getText();
                    String dates = textdate.getText();
                        
                String data = cards +" "+ cvvs +" "+countrys+" "+dates+" ";
                write(data);
                Gui_Payment paym = new Gui_Payment();
                paym.setVisible(true);
                setVisible(false);
                }
            }
        });
    }
}
