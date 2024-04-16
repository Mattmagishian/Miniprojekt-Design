package model;



public class Copy
{
    private int serialNo;
    private boolean isHome;

    public Copy (int sNo ) {
        
    sNo= serialNo;
    isHome = true;
    }
    
    public int getserialNo(){
        return serialNo;
    }
    
    public boolean getisHome() {
    return isHome;
    }
    
    public void setserialNo(int newNo){
    newNo = serialNo;
    }
    
    public void newStatus(boolean newStatus){
    newStatus = isHome;
    }

    
}
