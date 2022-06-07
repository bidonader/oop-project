package travel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laptop
 */


public class Accounts {
    
  private String Fullname;
  
  private String email;
  
  private int Day;
  
  private String Password;
  
  private int m;
  
 private int y;
 
 private  Boolean Isadmin;
 
 public String getMail() {
     return email;
 }
 public String getPassword() {
     return Password;
 }
 public void setPassword(String ps) {
     Password = ps;
 }

    public void Fullname(String Fn) {
        Fullname = Fn;
        
    }
    public String GetFullname() {
        return Fullname;
    }
    
    public void setEmail(String em) {
       email = em;
    }
    
    
    
    public String Getemail() {
        return email;
    }
    
    public void SetDate(int day,int month,int year ) {
  
        Day=day;
        m=month;
        y=year;
        
    }
    
    public int GetDay() {
        return Day;
    }
    public int GetMonth() {
        return m;
    }
    public int GetYear() {
        return y;
    }
    public void setMail(String nmail) {
        email = nmail;
    }
    void SetPass(String pass) {
        Password=pass;
    }
    

    public String GetPass() {
       return Password;
    }
 public void setadmin( Boolean b ){
     Isadmin = b;
 }
 public Boolean getAdmin() {
     return Isadmin;
 }
 

}