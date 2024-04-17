package controller;

import model.*;
public class LendLpController
{
    //fields
    
    //constructor
    public LendLpController() {
        
    }
    
    public void createLoan(int loanNo, String borrowDate, int period, boolean status, Friend loaner) {
        Loan newLoan = new Loan(loanNo, borrowDate, period, status, loaner);
    }
    
    public Friend findFriendByPhoneNo(String phoneNo) {
        //TODO
        FriendController friendController = new FriendController();
        Friend friend = friendController.findFriendByPhoneNo(phoneNo);
        return friend;
    }
    
    public Copy findCopyBySerialNo(int serialNo) {
        //TODO
        LpController lpController = new LpController();
        
        return null;
    }
    
    public boolean addCopyToLoan(Copy copy) {
        //TODO
        
        return false;
    }
    
    public boolean addLoanToContainer(Loan newLoan) {
        //TODO
        return false;
    }
}
