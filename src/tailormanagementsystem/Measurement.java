/*
 * Java Class : Measurement
 */
package tailormanagementsystem;

public class Measurement {
    
    private double shoulder, chest, armpit, waist, hip;
    private double dressLength, sleeveLength, skirtLength;
    private String attireType;
    
    //constructor
    public Measurement(){
        shoulder = 0;
        chest = 0;
        armpit = 0;
        waist = 0;
        hip = 0;
        dressLength = 0;
        sleeveLength = 0;
        skirtLength = 0;
    }
    
    public double getShoulder(){
        return shoulder;
    }
    
    public void setShoulder(double shoulder){
        this.shoulder = shoulder;
    }
    
    public double getChest(){
        return chest;
    }
    
    public void setChest(double chest){
        this.chest = chest;
    }
    
    public double getArmpit(){
        return armpit;
    }
    
    public void setArmpit(double armpit){
        this.armpit = armpit;
    }
    
    public double getWaist(){
        return waist;
    }
    
    public void setWaist(double waist){
        this.waist = waist;
    }
    
    public double getHip(){
        return hip;
    }
    
    public void setHip(double hip){
        this.hip = hip;
    }
    
    public double getDressLength(){
        return dressLength;
    }
    
    public void setDressLength(double dressLength){
        this.dressLength = dressLength;
    }
    
    public double getSleeveLength(){
        return sleeveLength;
    }
    
    public void setSleeveLength(double sleeveLength){
        this.sleeveLength = sleeveLength;
    }
    
    public double getSkirtLength(){
        return skirtLength;
    }
    
    public void setSkirtLength(double skirtLength){
        this.skirtLength = skirtLength;
    }
    
    public String getAttire(){
        return attireType;
    }
    
    public void setAttire(String type){
        attireType = type;
    }
}
