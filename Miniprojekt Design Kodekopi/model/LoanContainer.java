package model;
import java.util.ArrayList;

public class LoanContainer
{
    // instance variables - replace the example below with your own
    private ArrayList<Loan> loans;
    private static LoanContainer instance;

    private LoanContainer(){
        loans = new ArrayList<>();
    }

    public static LoanContainer getInstance(){
        if (instance == null){
            instance = new LoanContainer();
        }
        return instance;
    }

    public boolean addLoanToLoanContainer(Loan loan) {
        boolean added = false;
        if (loan != null) {
            loans.add(loan);
            added = true;
        }
        return added;
    }
}
