/*
 *
 */
package tailormanagementsystem;

public class Customer {
    
    private String custName;
    private String custID;
    private String phoneNumber;
    private Measurement[] measurement;
    private Booking booking;
   
    
    //constructor
    public Customer(){
        custName = "No name";
        custID = "Unassigned";
        phoneNumber = "Unassigned";
    }
    
    public String getCustName(){
        return custName;
    }
    
    public void setCustName(String cName){
        custName = cName;
    }
    
    public String getCustID(){
        return custID;
    }
    
    public void setCustID(String cID){
        custID = cID;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public void setPhoneNumber(String pNumber){
        phoneNumber = pNumber;
    }
    
    public Measurement[] getMeasurement(){
        return measurement;
    }
    
    public void setMeasurement(int quantity){
        measurement = new Measurement[quantity];
        for(int i=0; i<measurement.length; i++){
            measurement[i] = new Measurement();
        }
    }
    
    public Booking getBooking(){
        return booking;
    }
    
}
