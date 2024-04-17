package controller;

import model.*;
public class LendLpController
{
    private Loan loan;
    private Friend friend;
    
    public void createLoan(int loanNo, String borrowDate, int period) {
        loan = new Loan(loanNo, borrowDate, period, friend);
    }
    
    public Friend findFriendByPhoneNo(String phoneNo) {
        //TODO
        FriendController friendController = new FriendController();
        friend = friendController.findFriendByPhoneNo(phoneNo);
        return friend;
    }
    
    public Copy findCopyBySerialNo(int serialNo) {
        LpController lpController = new LpController();
        Copy copy = lpController.findCopyBySerialNo(serialNo);
        return copy;
    }
    
    public boolean addCopyToLoan(Copy copy) {
        return loan.addCopyToLoan(copy);
    }
    
    public boolean addLoanToContainer() {
        return LoanContainer.getInstance().addLoanToLoanContainer(loan);
    }
}
