/*
 * Java Class   : Tailor
 */
package tailormanagementsystem;

public class Tailor extends Staff {
    private Measurement measurement;
    
    public Tailor(){
        super();
        position = "Tailor";
    }
    
    public String getTailorName(){
        return staffName;
    }
    
    public String getTailorID(){
        return staffID;
    }
    
    public Measurement getMeasurement(){
        return measurement;
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
        position = "Tailor";
    }

    @Override
    protected String getPosition() {
        return position;
    }
}
