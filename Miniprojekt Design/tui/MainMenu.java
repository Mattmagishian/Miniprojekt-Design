package tui;
import controller.*;
import model.*;

public class MainMenu
{
    private LendLpController lendLpController;
    private FriendController friendController;
    private LpController lpcontroller;
    
    
    public MainMenu()
    {
        System.out.print("****");
    }
    
    public Friend findFriendByPhoneNo(String phoneNo){
        //TODO
        return null;
    }
    
    public void createLoan(String loanNo, String borrowDate, int period, Friend friend){
        //TODO
    }
    
    public Copy findCopyBySerialNo(int serialNo){
        //TODO
        return null; 
    }
    
    public Copy addCopyToLoan(Copy copy){
        //TODO 
        return null;
    }
    
    public void endLoan(){
        //TODO 
    }
}
