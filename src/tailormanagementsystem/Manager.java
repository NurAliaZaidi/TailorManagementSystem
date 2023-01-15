/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tailormanagementsystem;

public class Manager extends Staff{
    private Booking booking;
    
    public Manager(){
        super();
    }
    
    public Manager(Booking booking){
        this.booking = booking;
    }
    
    public String getManagerName(){
        return staffName;
    }
    
    public String getManagerID(){
        return staffID;
    }
    
    public Booking getBooking(){
        return booking;
    }

    @Override
    protected void setStaffID(String sID) {
        staffID = sID;
    }

    @Override
    protected void setStaffName(String sName) {
        staffName = sName;
    }

    @Override
    protected void setPosition(String sPosition) {
        position = "Manager";
    }

    @Override
    protected String getPosition() {
        return position;
    }
}
