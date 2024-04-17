package model;

import model.Friend;
import java.util.ArrayList;

public class Loan
{
    private int loanNo;
    private String borrowDate;
    private int period;
    private Friend friend;
    private ArrayList<Copy> loanCopies;

    public Loan(int loanNo, String borrowDate, int period, Friend friend) {
        this.loanNo = loanNo;
        this.borrowDate = borrowDate;
        this.period = period;
        this.friend = friend;
        loanCopies = new ArrayList<>();
    }

    public int getLoanNo() {
        return loanNo;
    }

    public String getBorrowDate() {
        return borrowDate;
    }
    
    public int getPeriod() {
        return period;
    }

    public void setLoanNo(int loanNo) {
        this.loanNo = loanNo;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public boolean addCopyToLoan(Copy copy) {
        boolean added = false;
        if(copy != null) {
            loanCopies.add(copy);
            added = true;
        }
        return added;
    }
}