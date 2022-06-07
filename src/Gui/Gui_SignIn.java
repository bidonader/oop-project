/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.lang.NullPointerException;
import java.lang.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import java.io.*;
import travel.*;

/**
 *
 * @author Laptop
 */
public class Gui_SignIn extends JFrame implements ActionListener ,Serializable, files  {
    JButton b;
    JLabel l1,l2,l3;
    int frame = 400;
    JTextField t1;
    JPasswordField p;
    JLabel Background = new JLabel();     
    Accounts a=new Accounts();
    public void read() {
        File file = new File("C:\\Users\\Ahmed\\Documents\\NetBeansProjects\\travel\\src\\Gui\\accounts.txt");
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
             while((st = br.readLine()) != null) {
                int b = st.indexOf(" ", 0);
                String name = st.substring(0, b);
                int email1 = st.indexOf(" ", b+1);
                String mail = st.substring(b+1, email1);
                if (t1.getText().equals(mail)) {
                try {
                    int pas = st.indexOf(" ", email1+1);
                    String pass = st.substring(email1+1, pas);
                    if (p.getText().equals(pass)) {
                        a.Fullname(name);
                        a.setEmail(mail);
                        a.setPassword(pass);
                        int ds = st.indexOf(" ", pas+1);
                        int day = Integer.parseInt(st.substring(pas+1, ds));
                        int ms = st.indexOf(" ", ds+1);
                        int month = Integer.parseInt(st.substring(ds+1, ms));
                        int ys = st.indexOf(" ", ms+1);
                        int year = Integer.parseInt(st.substring(ms+1, ys));
                        a.SetDate(day, month, year);
                        int adminsss = st.indexOf(" ", ys+1);
                        int admin = Integer.parseInt(st.substring(ys+1, ys+2));
                        a.setadmin((admin==1));
                        setVisible(false);
                        Gui_Main mai = new Gui_Main(a);
                        mai.setVisible(true);
                    }
                } catch (StringIndexOutOfBoundsException n) {
                        System.out.println(n);
                }

                }
            }
            br.close();
        } catch(FileNotFoundException  e ) {
            
        } catch (IOException s) {
            
        }
    }
    public void write(String saveData) {}
    public void update() {}


    Gui_SignIn get() {
        return this;
    }
    public Gui_SignIn()
    {
        setLayout(null);
        setSize(frame,frame);
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);

       try
       {
           Container c=getContentPane();
           
           
           
           l1=new JLabel("Enter Your E-mail");
           l2=new JLabel("Enter Your Password");
           l3=new JLabel("If You Don't Have An Account Please Sign Up");
           
           
           
           
           
           l1.setForeground(Color.BLACK);
           l2.setForeground(Color.BLACK);
           l3.setForeground(Color.blue);
           
           t1=new JTextField();
            p=new JPasswordField();
             b=new JButton("Log In");
           
           l1.setBounds(100,0,100, 100);
           t1.setBounds(100,60 ,200, 30);
           l2.setBounds(100, 20, 200, 200);
           p.setBounds(100,145 ,200 , 30);
           b.setBounds(150,250,90,30);
           l3.setBounds(100,250,260, 100);
          

           
          
           
           
           
           
          
           
           
         
           Background.setIcon(new ImageIcon(new ImageIcon("login.jpg").getImage().getScaledInstance(frame, frame, Image.SCALE_DEFAULT)));                            
           Background.setBounds(0, 0, frame, frame);
          c.add(l1);
          c.add(t1);
          c.add(l2);
          c.add(p);
          c.add(b);
          c.add(l3);
          c.add(Background);
         
          this.setResizable(false);
          
          
          Background.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent me)
            {
                requestFocusInWindow();
            }
                                                                                             
            @Override
            public void mousePressed(MouseEvent me)
            {
                
            }

            @Override
            public void mouseReleased(MouseEvent me)
            {}

            @Override
            public void mouseEntered(MouseEvent me)
            {}

            @Override
            public void mouseExited(MouseEvent me)
            {}
        });
         
          b.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent evt)
               {
                  
 
                   
                   read();
                       
                                     
                   
                   
                   
               }
           });
        
        l3.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent me)
            {
                
            }
                                                                                             
            @Override
            public void mousePressed(MouseEvent me)
            {
                try {
                    Gui_SignUp cc=new Gui_SignUp(get());
                    cc.setVisible(true);
                    setVisible(false);
                } catch(IOException e) {
                       
                }
                
               
            }

            @Override
            public void mouseReleased(MouseEvent me)
            {}

            @Override
            public void mouseEntered(MouseEvent me)
            {}

            @Override
            public void mouseExited(MouseEvent me)
            {}
        });
      }catch(NullPointerException  e)
      {
          System.out.println("error");
      }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    
   

    
    
     
        
          
          
          
          
          
}