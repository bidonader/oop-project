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
public class CreditCard {
    private String country;
    private String  VisaNumber;
    private String CVV; 
    private String Date;
 
    public CreditCard(String country , String Visanumber,String CVV,String date){
        this.country = country;
        
        this.VisaNumber=Visanumber;
        
        this.CVV=CVV;
        
        this.Date=date;
    }

public String getVisanum(){
    return(VisaNumber);
}
    

public String getCVV(){
     return(CVV);
}


public String getDate(){
     return(Date);
}

}