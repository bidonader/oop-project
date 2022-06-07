/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;
import java. awt. Dimension;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.lang.NullPointerException;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.Map;
import java.io.IOException;
import travel.*;
/**
 *
 * @author dark-
 */
public class Gui_SignUp  extends JFrame implements files {
    ArrayList<String> lis = new ArrayList<String>();
    public void read() {
        File file = new File("C:\\Users\\M. HAWASH\\Desktop\\oop-project\\src\\Gui\\accounts.txt");
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
             while((st = br.readLine()) != null) {
                int b = st.indexOf(" ", 0);
                int email = st.indexOf(" ", b+1);
                String mail = st.substring(b+1, email);
                lis.add(mail);
                
            }
             br.close();
        } catch(FileNotFoundException  e ) {
            
        } catch (IOException s) {
            
        }
    }
    public void write(String saveData) {
        try {
            String str = "Hello";
            File file = new File("C:\\Users\\M. HAWASH\\Desktop\\oop-project\\src\\Gui\\accounts.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            PrintWriter pr = new PrintWriter(writer);
            pr.println(saveData);
            writer.close();
            pr.close();
        } catch (IOException e) {
            
        }
    }
    public void update() {}
    
   Container cp= getContentPane();
        static private JLabel l1,l2,l3,l4,l5,l6,l7,l8,empty;
        static private JTextField j1,j2;
        static private JPasswordField p,repetedp;
        static private JComboBox cD,cM,cY;
        static private JButton signup,Exit;
        static private Gui_SignIn sign; 

        private class listener implements ActionListener {
            /*HashMap<String, HashMap> selects = new HashMap<String, HashMap>(); for(Map.Entry<String, HashMap> entry : selects.entrySet()) { String key = entry.getKey(); HashMap value = entry.getValue();  }*/
        public listener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(j1.getText().equals("")||j2.getText().equals("")||p.getText().equals("456325")||repetedp.getText().equals("123456")||cD.getSelectedItem().equals("0")||cM.getSelectedItem().equals("0")){
           JOptionPane.showMessageDialog(null, "Please Fill All Of Your Info", "Error" , JOptionPane.INFORMATION_MESSAGE);   
            
            }
            else{
                for (int i = 0; i < lis.size(); i++) {
                    if (lis.get(i).equals(j2.getText())) {
                        JOptionPane.showMessageDialog(null, "Email already Exists", "Error" , JOptionPane.INFORMATION_MESSAGE);
                        return;
                    } 
                }
                if (!p.getText().equals(repetedp.getText())) {
                    JOptionPane.showMessageDialog(null, "Passwords don't match", "Error" , JOptionPane.INFORMATION_MESSAGE);
                }
                String name = j1.getText();
                String emails = j2.getText();
                String pass = p.getText();
                
                int day = Integer.valueOf((String)cD.getSelectedItem());
                int month = Integer.valueOf((String)cM.getSelectedItem());
                int year = Integer.valueOf((String)cY.getSelectedItem());
                Accounts acc = new Accounts();
                String da = name + " " + emails + " " + pass + " " + day + " " + month + " " + year + " 0";
                acc.Fullname(name);
                acc.setEmail(emails);
                acc.setPassword(pass);
                acc.SetDate(day, month, year);
                acc.setadmin(false);
                write(da);
                setVisible(false);
                try {
                    Gui_Main main = new Gui_Main(acc);
                    main.setVisible(true);
                } catch (IOException ex) {
                    System.out.println(e);
                }
            }
        }
    }  
    
    
     public Gui_SignUp(Gui_SignIn f) throws IOException{
        setTitle("Travel SignUp");
        setSize(400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        read();
         setLocationRelativeTo(null);
         Container cp= getContentPane();
         sign = f;
         try
         {
          
         l1 = new JLabel("Full Name");
         l2 = new JLabel("Email");
         l3 = new JLabel("Password");
         l4 = new JLabel("Repeat Password");
         l5 = new JLabel("Date Of Birth");
         l6 = new JLabel("Day");
         l7 = new JLabel("Month");
         l8 = new JLabel("Year");
         empty = new JLabel("  ");
         
         
         j1=new JTextField( "");
         j2=new JTextField( "");
       
         p=new JPasswordField( "456325");
         repetedp=new JPasswordField( "123456");
         
         signup=new JButton("SignUp");
         Exit=new JButton("Back");
         
         String Str=new String();
         cD=new JComboBox();
         cM=new JComboBox();
         cY=new JComboBox();
          for(int i=0;i<32;i++){
            Str=Integer.toString(i); 
            cD.addItem(Str);
         }
         for(int i=0;i<13;i++){
            Str=Integer.toString(i); 
            cM.addItem(Str);
         }
         for(int i=1950;i<2003;i++){
            Str=Integer.toString(i); 
            cY.addItem(Str);
         }
         
         signup.addActionListener(new listener());
         
        Exit.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent arg0) {
                 setVisible(false);
                 sign.setVisible(true);
             }
        });
         //this.setIconImage(image);
         cp.setLayout(new GridLayout(10,2));
         // BufferedImage img = ImageIO.read(new File("C:\\Users\\dark-\\OneDrive\\Desktop\\OOP\\logo1.jpg")); 
         //JLabel picLabel = new JLabel(new ImageIcon(img));
         //cp.add(picLabel);
         
        
        cp.add(l1);
        cp.add(j1);
        
       
        cp.add(l2);
        cp.add(j2);
        
        cp.add(l3);
        cp.add(p);
        
        cp.add(l4);
        cp.add(repetedp);
        
        cp.add(l5);
        cp.add(empty);
        cp.add(l6);
        cp.add(cD);
        cp.add(l7);
        cp.add(cM);
        cp.add(l8);
        cp.add(cY);
  
        cp.add(Exit);
        cp.add(signup);
        
         }
         catch(NullPointerException e){
             System.out.print("error");
               System.out.println(e);
        }
        //this.add();
        
     }
    
}
