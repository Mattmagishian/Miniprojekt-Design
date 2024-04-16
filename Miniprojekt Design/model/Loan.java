package model;

import model.Friend;
public class Loan
{
    //fields
    private int loanNo;
    private String borrowDate;
    private int period;
    private boolean status;
    private Friend loaner;

    //constructor
    public Loan(int loanNo, String borrowDate, int period, boolean status, Friend loaner) {
        this.loanNo = loanNo;
        this.borrowDate = borrowDate;
        this.period = period;
        this.status = status;
        this.loaner = loaner;
    }

    //getters - accessors
    public int getLoanNo() {
        return loanNo;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public int getPeriod() {
        return period;
    }

    public boolean getStatus() {
        return status;
    }

    //setters - mutators
    public void setLoanNo(int loanNo) {
        this.loanNo = loanNo;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //empty stub
    public boolean addCopyToLoan(Copy copy) {
        //TODO
        return false;
    }
}