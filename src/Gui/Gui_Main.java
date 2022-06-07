/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;
import travel.Accounts;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author laptop
 */
public class Gui_Main extends JFrame implements files{
    

    
   static JButton Admin,Info,search;
   static JTextField j1,j2;
   Accounts acc;
    public Gui_Main getMain() {
        setVisible(true);
        return this;
    }
    ArrayList<String> arr = new ArrayList<String>();
    HashMap<String, ArrayList<String>> hash = new HashMap<String, ArrayList<String>>();
    
    public void read() {
        File file = new File("C:\\Users\\M. HAWASH\\Desktop\\oop-project\\src\\Gui\\hotels.txt");
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            int i = 0;
            String key = "";
             while((st = br.readLine()) != null) {
                 if (i == 0) {
                     key = st;
                     arr.add(key);
                 } else {
                     arr.add(st);                     
                 }
                 i++;
                 if (i == 4 ){
                     hash.put(key, arr);
                     arr = new ArrayList<String>();
                     i = 0;
                 }
             }
             br.close();
        } catch(FileNotFoundException  e ) {
            
        } catch (IOException s) {
            
        }
    }
    public void write(String saveData) {}
    public void update() {}

    public Gui_Main(Accounts u1) throws IOException{
    
        read();
             
         setTitle("MyTrip details");
         acc = u1;
         setSize(1000,350);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLocationRelativeTo(null);
         Container cp= getContentPane();
         JLabel Uname,rec,empty;
         JPasswordField p,repetedp;
         JComboBox recbox;
         BufferedImage img = ImageIO.read(new File("C:\\Users\\M. HAWASH\\Desktop\\oop-project\\src\\travel\\logo.jpg"));
                
         try
         {
           
             Uname = new JLabel("Welcome  "+u1.GetFullname());
             Uname.setBounds(50, 60, 100,30);
           //Uname.setFont(font);
             empty   =   new JLabel("");
             rec     =   new JLabel(" List of Hotels ");
             rec.setBounds(50, 150, 200,30);
             JLabel picLabel  =   new JLabel(new ImageIcon(img));
             picLabel.setBounds(150,-50,550,250);
             Admin   = new JButton("Admin");
             Admin.setBounds(700, 60, 100,30);
             Info    = new JButton("Info");
             Info.setBounds(840, 60, 100,30);
             search  =new JButton("Search");
             search.setBounds(840, 200, 100,30);
             j1      = new JTextField("");
             j1.setBounds(200, 200 , 600 ,30);
             //read from the file 3 rand hotels 
      

             
             recbox=new JComboBox();
             recbox.setBounds(50,200,125,25);
             Admin.addActionListener(new listener());
             Info.addActionListener(new listener());
             search.addActionListener(new listener());
             recbox.addItem("none");
            for(Map.Entry<String, ArrayList<String>> entry : hash.entrySet()) { 
                String key = entry.getKey();
                recbox.addItem(key);
            }
          
            recbox.addActionListener (new ActionListener () {
                public void actionPerformed(ActionEvent e) {
                    String it = (String)recbox.getSelectedItem();
                    if (it != "none") {
                        Gui_Hotel hot = new Gui_Hotel(hash.get(it), getMain());
                        setVisible(false);
                        hot.setVisible(true);
                    }
                }
            });

             cp.add(j1);
             cp.add(recbox);
             cp.add(Uname);
             cp.add(rec);
             cp.add(Admin);
             cp.add(Info);
             cp.add(picLabel);
             cp.add(search);  
             cp.add(empty);
              
                        
           
             
             
             
             cp.setVisible(true);
             if (!u1.getAdmin()) {
                 Admin.setVisible(false);
             }
         }
         catch(NullPointerException e){
             System.out.print("error");
               System.out.println(e);
        }
        
        //this.add();

        
     }
   private class listener implements ActionListener {

        public listener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            
           if(e.getSource()==Admin){
               Gui_Admin ad = new Gui_Admin(getMain());
               setVisible(false);
               ad.setVisible(true);
           }
           else if(e.getSource()==Info){
               /*Gui_statistics stats = new Gui_statistics();
               stats.setVisible(true);
               setVisible(false);
               */
               Gui_User user = new Gui_User(getMain(), acc);
               setVisible(false);
               user.setVisible(true);
           }
           else{
               if((j1.getText()).equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter An Item TO Search For", "Error" , JOptionPane.INFORMATION_MESSAGE); 
           } else {
                   if (hash.get((String)j1.getText()) != null) {
                        Gui_Hotel hot = new Gui_Hotel(hash.get((String)j1.getText()), getMain());
                        setVisible(false);
                        hot.setVisible(true);
                    }

                   }
               }
        }
    }  
}
 
