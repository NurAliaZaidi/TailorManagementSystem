/*
 * Java Class   : Staff 
 */
package tailormanagementsystem;

abstract public class Staff {
    protected String staffID;
    protected String staffName;
    protected String position;
    
    //constructor
    public Staff(){
        
        staffID = "Unassigned";
        staffName = "Unnamed";
        position = "Unassigned";
    }
    
    protected String getStaffID(){
        return staffID;
    }
    
    protected String getStaffName(){
        
        return staffName;
    }
    
    abstract protected void setStaffID(String sID);
    abstract protected void setStaffName(String sName);
    abstract protected void setPosition(String sPosition);
    abstract protected String getPosition();
    
}
