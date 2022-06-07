package Gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import java.util.Random;

public class Gui_statistics extends JFrame{
   private Font         font; 

   public Gui_statistics () {
        setSize( 600, 400 );
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        show();

   }

   public void paint( Graphics g ) {

      font = new Font("Sanserif", Font.BOLD, 14);
      int prev_equ=0;
      int data[] = {7, 7, 7, 7, 7, 7};
      int sum = 0;
      for (int i = 0; i <6 ; i++) {
          sum += data[i];
      }
        int one = 360/sum;
      for (int i =0; i < 6 ; i++) { 
         int equ1 =data[i]*360/sum;
        Random rand = new Random();
        float rs = rand.nextFloat();
        float gs = rand.nextFloat();
        float bs = rand.nextFloat();
        Color randomColor = new Color(rs, gs, bs);
        g.setColor( randomColor );
        //g.drawString("Tool Accessories Sales: 12%", 420, 80+(i*20));

         if(i==4){
            g.fillArc( 110, 80, 300, 300, prev_equ, 360-prev_equ);
        }
         else{
        g.fillArc( 110, 80, 300, 300, prev_equ, equ1);
         }
       prev_equ += equ1;
        
    }
      g.setColor( Color.black );
      g.drawArc( 110, 80, 300, 300, 0, 360 );
 
   }
}
