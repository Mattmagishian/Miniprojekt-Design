package model;

public class Copy
{
    private int serialNo;
    private boolean isHome;

    public Copy (int serialNo) {
        this.serialNo = serialNo;
        isHome = true;
    }
    
    public int getSerialNo(){
        return serialNo;
    }
    
    public boolean getIsHome() {
        return isHome;
    }
    
    public void setSerialNo(int serialNo){
        this.serialNo = serialNo;
    }
    
    public void setIsHome(boolean isHome){
        this.isHome = isHome;
    }
    
}
