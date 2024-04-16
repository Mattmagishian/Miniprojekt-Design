package controller;

import model.*;
public class LendLpController
{
    //fields
    
    //constructor
    public LendLpController() {
        
    }
    
    public void createLoan(int loanNo, String borrowDate, int period, boolean status, Friend loaner) {
        //TODO implement
        //this is incorrect for some reason:D manana manana
        //Loan newLoan = new Loan(loanNo, borrowDate, period, status, loaner);
    }
    
    public Friend findFriendByPhoneNo(String phoneNo) {
        //TODO
        return null;
    }
    
    public Copy findCopyBySerialNo(int serialNo) {
        //TODO
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
