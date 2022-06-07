/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel;

/**
 *
 * @author dark-
 */
public class Tickets {

    private String departure;

private String arrival;

private String transporttype;

private int seatnum ;

private char level;

  public Tickets(String departure,String arrival, String transtype,int seatnum,char level){
        this.departure=departure;
        this.arrival=arrival;
        transporttype=transtype;    
        this.seatnum=seatnum;
        this.level=level;        
        
    }

public  int pricecalculator(){
      if(level=='F'||level=='f'){
            if(transporttype=="A"||transporttype=="a") {
                return(2000);
            }
       else if(transporttype=="t"||transporttype=="T"){
           return(200);
       }
       else{
          // System.out.print("error enter correct transport type for First class ");
           return(-1);
       }
        }
        else if(level=='E'||level=='e'){
             if(transporttype=="A"||transporttype=="a") {
           return(750);
       }
       else if(transporttype=="t"||transporttype=="T"){
           return(100);
       }
        else if(transporttype=="B"||transporttype=="b"){
           return(50);
       }
       else{
          //error and make a joption pane " error enter correct transporttype"
           return(-1);
       }
        }
        else{
           //  error and make a joption pane "enter correct travel class type"
           return(-1); 
        }


}
}
