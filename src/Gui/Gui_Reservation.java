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

public class Gui_Reservation extends JFrame{
    
    JButton book,cancel;
    JPanel Userpanel;
    JTextField texto;
    JTextField textfrom;
    JComboBox<String> transportddl;
    JLabel to;
    JLabel from;
    JLabel transport;
    
    public Gui_Reservation(Gui_Main main) {
        setTitle("Reservation");
        setSize(400,200);
        String transporting[]= {"Select Type","Car", "Train","Airplane"};
        //intialize 
        
        book = new JButton("Book");
        cancel = new JButton("Cancel");
        transportddl = new JComboBox<String>();
        Userpanel = new JPanel();
        texto = new JTextField("DD/MM/YYYY");
        textfrom = new JTextField("DD/MM/YYYY");
        from = new JLabel("From");
        to = new JLabel("To");
        transport = new JLabel("Transport type");
        setLocation(500,280);
        Userpanel.setLayout (null); 
        
        //fill combobox
        
        for (int i = 0 ; i <4 ; i++)
        {
            transportddl.addItem(transporting[i]);
        }
        
        // location of items in frame
        
        textfrom.setBounds(120,65,80,20);
        texto.setBounds(260,65,80,20);
        from.setBounds(20,65,80,20);
        to.setBounds(220,65,80,20);
        transport.setBounds(20,30,120,20);
        book.setBounds(120,130,80,20);
        cancel.setBounds(260,130,80,20);
        transportddl.setBounds(120,30,220,20);
         
        //adding items to panel
        
        Userpanel.add(book);
        Userpanel.add(cancel);
        Userpanel.add(textfrom);
        Userpanel.add(texto);
        Userpanel.add(from);
        Userpanel.add(to);
        Userpanel.add(transportddl);
        Userpanel.add(transport);
        
        getContentPane().add(Userpanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // go to payment gui
        
        book.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(textfrom.getText().equals("")||texto.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Please Fill All Of Your Info", "Error" , JOptionPane.INFORMATION_MESSAGE);   
            
            }
               else{
                   Gui_Payment paym = new Gui_Payment();
                paym.setVisible(true);
                setVisible(false);
                }
            }
        });
        
        //return to main gui
        
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                main.setVisible(true);
            }
        });
    }
}
