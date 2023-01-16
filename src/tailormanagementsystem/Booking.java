/*
 * Java Class  : Booking
 */
package tailormanagementsystem;

public class Booking {
    private String dateBooking, datePickup, tailorName;
    private double costBooking, totalPrice;
    private int qty;
    
    public Booking(){
        dateBooking = "Unassigned";
        datePickup = "Unassigned";
        costBooking = 0;
        totalPrice = 0;
        tailorName = "Unassigned";
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
    
    public void setQuantity(int qty){
        this.qty = qty;
    }
    
    public int getQuantity(){
        return qty;
    }
    
    public double getCostBooking(String attireType){
        if(attireType == "Riau"){
            costBooking = 40.00;
        }
        else if(attireType == "Moden"){
            costBooking = 45.00;
        }
        else if(attireType == "Kedah"){
            costBooking = 50.00;
        } 
        else {
            costBooking = 60.00;
        }
        
        return costBooking;
    }
    
    public void setTailor(String tailorName){
        this.tailorName = tailorName;
    }
    
    public String getTailor(){
        return tailorName;
    }
    
}
