package tailormanagementsystem;

class Array {
    
    private int custIndex;
   
    
    //constructor
    public Array(){
        
    }
    
    public Array(int custIndex){
        this.custIndex = custIndex;
    }
    
    public void setCurrentCustIndex(){
        custIndex = custIndex + 1;
    }
    
    public int getCurrentCustIndex(){
        return custIndex;
    }
    
    
    
}

