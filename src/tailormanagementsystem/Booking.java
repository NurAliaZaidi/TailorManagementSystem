/*
 * Java Class  : Booking
 */
package tailormanagementsystem;

public class Booking {
    private String dateBooking, datePickup;
    private double costBooking;
    private int qty;
    
    public Booking(){
        dateBooking = "Unassigned";
        datePickup = "Unassigned";
        costBooking = 0;
        qty = 0;
    }
    
    public String getDateBooking(){
        return dateBooking;
    }
    
    public void setDateBooking(String dateBooking){
        this.dateBooking = dateBooking;
    }
    
    public String getDatePickup(){
        return datePickup;
    }
    
    public void setDatePickup(String datePickup){
        this.datePickup = datePickup;
    }
    
    public double getCostBooking(String attireType){
        if(attireType == "Riau"){
            costBooking = 40;
        }
        else if(attireType == "Moden"){
            costBooking = 45;
        }
        else if(attireType == "Kedah"){
            costBooking = 50;
        } 
        else {
            costBooking = 60;
        }
        
        return costBooking;
    }
    
    public void setQuantity(int qty){
        this.qty = qty;
    }
    
    public int getQuantity(){
        return qty;
    }
    
}
