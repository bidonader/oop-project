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
public class Hotel {
    
private String name;

private int boughtTimes;

private double price;

private String description;

private int numrooms;

private Reviews review;

 public Hotel(String Hname,int Hbought,double Hprice, String loc , int roomnum){
     
     name=Hname;
     
     boughtTimes=Hbought;
     
     price= Hprice;
     
     description=loc;
     
     numrooms=roomnum;
     
 }
 
 public void setName(String Hname){
 
     name=Hname;
     
 }
 
  public void setBought(int Hbought){
      
      boughtTimes=Hbought;
      
  }
  
   public void setDescription(String Hloc){
      
      description=Hloc;
      
  }
   
   public void setrooms(int Hrooms){
      
      numrooms=Hrooms;
      
  }  
   
public void setReview(String comment,float rating ) {
   review.Reviews(comment,rating);
    
}
   
public void setPrice(double Hprice) {
     price= Hprice;
    
}

 public String getName(){
     
     return(name);
 }
 
 public double getPrice(){
     
     return(price);
     
 }

 public String getDisc(){
     
     return(description);
     
 }

 public int getnumrooms(){
     
     return(numrooms);
     
 }

  public int gettimesbought(){
     
     return(boughtTimes);
     
 }
  
 }
