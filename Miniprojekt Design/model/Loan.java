package model;

import model.Friend;
import java.util.ArrayList;

public class Loan
{
    private int loanNo;
    private String borrowDate;
    private int period;
    private boolean status;
    private Friend loaner;
    private ArrayList<Copy> loanCopies;

    public Loan(int loanNo, String borrowDate, int period, boolean status, Friend loaner) {
        this.loanNo = loanNo;
        this.borrowDate = borrowDate;
        this.period = period;
        this.status = status;
        this.loaner = loaner;
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

    public boolean getStatus() {
        return status;
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

    public void setStatus(boolean status) {
        this.status = status;
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