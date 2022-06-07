/*34
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.imageio.*;
import java.lang.NullPointerException;
import java.io.*;
import java.util.ArrayList;
import travel.*;
/**
 *
 * @author Laptop
 */
public class Gui_Payment extends JFrame implements ActionListener 
{

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    int frame=400;
   
                
    public Gui_Payment()
    {
        setLayout(null);
        JLabel Background = new JLabel();
        Boolean x;
        
        setSize(frame,frame);
        setTitle("Payment");
        try
        {
            Container c3=getContentPane();
            JLabel l1 ,l2,l3;
            
            l1=new JLabel("The Amount You Should Pay is =");
            l1.setForeground(Color.BLACK);
            l2=new JLabel("You Choose Hotel and spend  days");
            l2.setForeground(Color.GREEN);
            l3=new JLabel("Choose The Way Of Payment");
            l3.setForeground(Color.ORANGE);
            
           
            Font f1=new Font("Serif",Font.BOLD,15);
            
            
            
             JRadioButton r1,r2;
             r1=new JRadioButton("Cash");
             r2=new JRadioButton("CreditCard");
             ButtonGroup g=new ButtonGroup();
             g.add(r2);
             g.add(r1);
             x=r2.isSelected();
             
             r2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Gui_Creditcard credit = new Gui_Creditcard();
                    credit.setVisible(true);
                    setVisible(false);
                }
            });
             r2.addActionListener(this);
             
           
             
            
            JButton b1=new JButton("Submit");
            
           
             
             Background.setIcon(new ImageIcon(new ImageIcon("mmimage.jpg").getImage().getScaledInstance(frame, frame, Image.SCALE_DEFAULT)));                            
           Background.setBounds(0, 0, frame, frame);
             
            
           
              
            l1.setBounds(100,250,190, 50);
            l3.setBounds(100,0,190,100);
            l2.setBounds(100, 50, 300, 300);
            r1.setBounds(100, 70 ,70,15);
            r2.setBounds(190, 70 ,90,15);
            b1.setBounds(150,330,90,30);
            c3.add(l3);
            c3.add(r1);
            c3.add(l2);
            c3.add(r2);
            c3.add(l1);
            c3.add(b1);
            c3.add(Background);
            
            
            Accounts a=new Accounts();
            ArrayList ar1=new ArrayList();
            
            
            b1.addActionListener(new ActionListener()
            {      
                    
                    @Override
               public void actionPerformed(ActionEvent evt1)
               {
                  
                   if(r2.isSelected())
                   {
                     
                      Gui_SignIn s=new Gui_SignIn();
                      s.setVisible(true);
                    
                   }
                   try{
                       
                        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("payement.bin"));
                        out.writeChars( a.GetFullname()+"/"+x);
                        out.close();
                        
                        
                   
                      }catch(IOException|NullPointerException e)
                   {
                        System.out.println("error");
                   }
                   
                    try{
                        ObjectInputStream in=new ObjectInputStream(new FileInputStream("payement.bin"));
                        System.out.println(a.GetFullname()+"/"+x);
                        in.close();
            
                         }catch(IOException e)
                       {
                        System.out.println("error");
                       }
                    
                    
                    
               }
                    
                
               
               });
         
           
           
            
           this.setResizable(false);
            
            
        }catch(NullPointerException e)
        {
          System.out.println("Error");
        }
        
    }
    
}
